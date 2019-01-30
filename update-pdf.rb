require 'asciidoctor'
require 'asciidoctor-pdf'
require_relative './autoxref-treeprocessor.rb'

Asciidoctor::Extensions.register do
  treeprocessor AutoXrefTreeprocessor  
end


def convert()
    old_verbose, $VERBOSE = $VERBOSE, false
    pdf = Asciidoctor.convert_file 'index.adoc', to_file: true, to_dir: '../pdf',  backend: 'pdf', safe: 'unsafe'    
    $VERBOSE = old_verbose
end

Dir.chdir('full') do
    convert()
end
