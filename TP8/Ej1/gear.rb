# frozen_string_literal: true
require_relative 'wheel'
class Gear
  def initialize(chain, cog, rim = nil , tire = nil)
    @chain = chain
    @cog = cog
    @wheel = Wheel.new(rim,tire)
  end

  def ratio
    @chain / @cog.to_f
  end

  def gear_inches
    ratio * @wheel.wheel_diameter
  end

end
