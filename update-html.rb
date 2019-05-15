require 'asciidoctor'
require 'asciidoctor-rouge'
# require 'asciidoctor-mathematical'
require_relative './default.rb'
require_relative './GoogleAnalyticsDocinfoProcessor.rb'
require_relative './autoxref-treeprocessor.rb'

Asciidoctor::Extensions.register do
  treeprocessor AutoXrefTreeprocessor
  docinfo_processor GoogleAnalyticsDocinfoProcessor
end


def convert()
    old_verbose, $VERBOSE = $VERBOSE, false

    html = Asciidoctor.convert_file 'index.adoc', to_file: false, header_footer: true, safe: 'safe'
    file = File.open("index.html", "w")
    file.print html
    file.close

    $VERBOSE = old_verbose
end


convert()
Dir.chdir('full') do
    convert()
end
