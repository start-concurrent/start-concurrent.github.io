require 'asciidoctor'
require 'rouge'
require 'asciidoctor-pdf'
require_relative './default.rb'
require_relative './autoxref-treeprocessor.rb'

Asciidoctor::Extensions.register do
    treeprocessor AutoXrefTreeprocessor
end


def convert()
    old_verbose, $VERBOSE = $VERBOSE, false
    source = 'index.adoc'

    Asciidoctor.convert_file source, to_file: true, to_dir: '../pdf', \
        attributes: { "pdf-themesdir" => "..", "pdf-theme" => "book" }, backend: 'pdf', safe: 'unsafe'

    $VERBOSE = old_verbose
end

pdf_dir = "pdf"
Dir.mkdir(pdf_dir) unless File.exist?(pdf_dir)
Dir.chdir('full') do
    convert()
end
