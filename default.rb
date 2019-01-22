# -*- coding: utf-8 -*- #
# frozen_string_literal: true

module Rouge
  module Themes
    # stolen from pygments
    class Default < CSSTheme
      name 'default'

      style Text,                        :fg => "#bbbbbb", :bg => "#f8f8f8"
  
      style Comment,                     :fg => "#408080", :italic => true
      style Comment::Preproc,            :fg => "#BC7A00"

      style Keyword,                     :fg => "#008000", :bold => true
      style Keyword::Pseudo,             :bold => false
      style Keyword::Type,               :fg => "#B00040"
  
      style Operator,                    :fg => "#666666"
      style Operator::Word,              :fg => "#AA22FF", :bold => true

      style Name::Builtin,               :fg => "#008000"
      style Name::Function,              :fg => "#0000FF"
      style Name::Class,                 :fg => "#0000FF", :bold => true
      style Name::Namespace,             :fg => "#0000FF", :bold => true
      style Name::Exception,             :fg => "#D2413A", :bold => true
      style Name::Variable,              :fg => "#19177C"
      style Name::Constant,              :fg => "#880000"
      style Name::Label,                 :fg => "#A0A000"
      style Name::Entity,                :fg => "#999999", :bold => true
      style Name::Attribute,             :fg => "#7D9029"
      style Name::Tag,                   :fg => "#008000", :bold => true
      style Name::Decorator,             :fg => "#AA22FF"
	  
      style Literal::String,             :fg => "#BA2121"      
      style Literal::String::Doc,        :italic => true
      style Literal::String::Interpol,   :fg => "#BB6688", :bold => true
      style Literal::String::Escape,     :fg => "#BB6622", :bold => true
      style Literal::String::Regex,      :fg => "#BB6688"
      style Literal::String::Symbol,     :fg => "#19177C"
      style Literal::String::Other,      :fg => "##008000"

      style Literal::Number,             :fg => "#666666"
	  
      style Generic::Heading,            :fg => "#000080", :bold => true
      style Generic::Subheading,         :fg => "#800080", :bold => true
      style Generic::Deleted,            :fg => "#A00000"
      style Generic::Inserted,           :fg => "#00A000"
      style Generic::Error,              :fg => "##FF0000"
      style Generic::Emph,               :italic => true
      style Generic::Strong,             :bold => true
      style Generic::Prompt,             :fg => "#000080", :bold => true
      style Generic::Output,             :fg => "#888"
      style Generic::Traceback,          :fg => "#04D"

      style Error,                       :fg => "#F00", :bg => "#FAA"
    end
  end
end
