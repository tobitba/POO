# frozen_string_literal: true
require_relative 'figure'
#require '../../TP8/TP3/point'

class Rectangle < Figure
  def initialize(top_left, bottom_right)
    @top_left = top_left
    @bottom_right = bottom_right
  end

  def base
    @bottom_right.x - @top_left.x
  end

  def height
    @bottom_right.y - @top_left.y
  end

  def area
    base * height
  end

  def perimeter
    2 * base + 2 * height
  end
  def to_s
    "Rectangle : [#{@bottom_right} , #{@top_left} ]"
  end
end
