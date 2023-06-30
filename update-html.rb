require 'asciidoctor'
require 'rouge'
require_relative './default.rb'
require_relative './GoogleAnalyticsDocinfoProcessor.rb'
require_relative './autoxref-treeprocessor.rb'


def convert()
    old_verbose, $VERBOSE = $VERBOSE, false

	Asciidoctor.convert_file 'index.adoc', to_file: true, header_footer: true, safe: 'safe'  

    $VERBOSE = old_verbose
end


convert()
Dir.chdir('full') do
    convert()
end
