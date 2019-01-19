require 'asciidoctor'
require_relative './GoogleAnalyticsDocinfoProcessor.rb'
require_relative './autoxref-treeprocessor.rb'

Asciidoctor::Extensions.register do
  treeprocessor AutoXrefTreeprocessor
  docinfo_processor GoogleAnalyticsDocinfoProcessor
end


def convert()
    html = Asciidoctor.convert_file 'index.adoc', to_file: false, header_footer: true, safe: 'safe'
    file = File.open("index.html", "w")
    file.print html
    file.close
end

convert()
Dir.chdir('full') do
    convert()
end
