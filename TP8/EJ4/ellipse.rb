# frozen_string_literal: true
require_relative 'figure'

class Ellipse < Figure
  def initialize(center_point, mayor_axis, minor_axis)
    @center_point = center_point
    @mayor_axis = mayor_axis
    @minor_axis = minor_axis
  end

  def area
    10
  end

  def perimeter
    5
  end
  def to_s
    "Ellipse #{@center_point} #{@mayor_axis} #{@minor_axis}"
  end
end
