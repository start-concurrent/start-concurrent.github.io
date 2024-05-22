require 'asciidoctor/extensions' unless RUBY_ENGINE == 'opal'

# A docinfo processor that appends the Google Analytics code to the bottom of the HTML.
#
# Usage
#
#   :google-analytics-account: UA-XXXXXXXX-1
#
# Requires Asciidoctor >= 1.5.2
Asciidoctor::Extensions.register do
  if @document.basebackend? 'html'
    docinfo_processor do
      at_location :footer
      process do |doc|
        next unless (ga_account_id = doc.attr 'google-analytics-account')
        %(<script async src="https://www.googletagmanager.com/gtag/js?id=#{ga_account_id}"></script>
          <script>
            window.dataLayer = window.dataLayer || [];
            function gtag(){dataLayer.push(arguments);}
            gtag('js', new Date());

            gtag('config', '#{ga_account_id}');
          </script>)
      end
    end
  end
end
