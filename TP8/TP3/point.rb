# frozen_string_literal: true

class Point
  def initialize(x,y)
    @x = x.to_f
    @y = y.to_f
  end
  def to_s
    "{#{@x} , #{@y}}"
  end

  def distance(other)
    Math.sqrt((@x-other.x)**2 + (@y-other.y)**2)
  end
  protected
  attr_accessor :x, :y


end
