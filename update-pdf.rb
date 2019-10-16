require 'asciidoctor'
require 'rouge'
require 'asciidoctor-pdf'
require 'asciidoctor-mathematical'
require_relative './default.rb'
require_relative './autoxref-treeprocessor.rb'

Asciidoctor::Extensions.register do
  treeprocessor AutoXrefTreeprocessor
end


def convert()
    old_verbose, $VERBOSE = $VERBOSE, false
    source = 'index.adoc'
    source = 'index-select.adoc'

    Asciidoctor.convert_file source, to_file: true, to_dir: '../pdf', \
        attributes: { "pdf-themesdir" => "..", "pdf-theme" => "book" }, backend: 'pdf', safe: 'unsafe'

    $VERBOSE = old_verbose
end

Dir.chdir('full') do
    convert()
end
