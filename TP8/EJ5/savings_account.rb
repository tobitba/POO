# frozen_string_literal: true
require_relative 'bank_account'

class SavingsAccount < BankAccount
  def initialize(id)
    create(id)
  end

  def extract?
    @balance > 0
  end
end
