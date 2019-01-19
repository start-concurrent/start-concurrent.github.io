class ExerciseNumberingProcessor < Asciidoctor::Extensions::TreeProcessor
	def process document
		return unless document.blocks?
		process_blocks document
		nil
	end

	def process_blocks node
		node.blocks.each_with_index do |block, i|
			if block.context == :literal &&
			  (((first_line = block.lines.first).start_with? '$ ') ||
				(first_line.start_with? '> '))
				node.blocks[i] = convert_to_terminal_listing block
			else
				process_blocks block if block.blocks?
			end
		end
	end
end