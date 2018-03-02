require 'asciidoctor'

# Use the Ascidoctor API to load the adoc file and convert it
# (apparently without same css as command-line conversion).
Asciidoctor.convert_file "README.adoc"

# Do the same thing, but break down the steps...
doc = Asciidoctor.load_file 'README.adoc', :header_footer => true
puts doc.doctitle
puts doc.attributes

file = File.open("x.html","w")
file.print doc.header
file.print doc.convert
file.close
