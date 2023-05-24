# frozen_string_literal: true

require_relative 'bank_account'

class CheckingAccount < BankAccount
  def initialize(id, overdraft)
    create(id)
    @overdraft = overdraft
  end

  def extract?
    @balance > @overdraft
  end
end
