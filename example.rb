# This code is not currently used.  It is just an example of using
# Ruby to control and extend the Asciidoctor conversion process.
#
require 'asciidoctor'
require 'asciidoctor/extensions'

class ProblemBlock < Asciidoctor::Extensions::BlockProcessor
  PeriodRx = /\.(?= |$)/

  use_dsl

  named :problem
  on_context :paragraph
  name_positional_attributes 'vol'
  parse_content_as :simple

  def process parent, reader, attrs
    volume = ((attrs.delete 'vol') || 1).to_i
    create_paragraph parent, (reader.lines.map {|l| l.upcase.gsub PeriodRx, '!' * volume }), attrs
  end
end

class ManInlineMacro < Asciidoctor::Extensions::InlineMacroProcessor
  use_dsl

  named :man
  name_positional_attributes 'volnum'

  def process parent, target, attrs
    text = manname = target
    suffix = ''
    target = %(#{manname}.html)
    suffix = if (volnum = attrs['volnum'])
      "(#{volnum})"
    else
      nil
    end
    parent.document.register :links, target
    %(#{(create_anchor parent, text, type: :link, target: target).convert}#{suffix})
  end
end

class SectionInlineMacro < Asciidoctor::Extensions::InlineMacroProcessor
  use_dsl

  named :section
  name_positional_attributes 'volnum'

  def process parent, target, attrs
    text = manname = target
    suffix = ''
    target = %(#{manname}.html)
    suffix = if (volnum = attrs['volnum'])
      "(#{volnum})"
    else
      nil
    end
    parent.document.register :links, target
    %(#{(create_anchor parent, text, type: :link, target: target).convert}#{suffix})
  end
end

Asciidoctor::Extensions.register do
  inline_macro SectionInlineMacro
end

Asciidoctor::Extensions.register do
  inline_macro ManInlineMacro
end

Asciidoctor::Extensions.register do
  block ProblemBlock
end

Asciidoctor.convert_file "test.adoc"
