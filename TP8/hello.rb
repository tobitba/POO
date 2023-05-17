# frozen_string_literal: true

class Hello
  puts "hello world!"

  def initialize(as,bs,cs)
    @as = as
    @bs = bs
    @cs = cs
  end

  def ==(o)
    return false unless o == this
    true
  end
end
