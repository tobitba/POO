# frozen_string_literal: true
require_relative 'figure'
require_relative 'ellipse'

class Circle < Ellipse
  def initialize(center_point, mayor_axis)
    super(center_point,mayor_axis,0)
  end
end
