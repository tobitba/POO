# frozen_string_literal: true

# Abstract Class
class BankAccount
  def initialize
    raise 'Cannot initialize abstract class BankAccount'
  end

  def create(id)
    @id = id
    @balance = 0
  end

  attr_reader :balance

  def extract?; end

  def amount_valid (amount)
    (amount.is_a? Numeric) || amount.positive?
  end

  def deposit(amount)
    return unless amount_valid amount

    @balance += amount
  end

  def extract(amount)
    raise 'no funds' unless (amount_valid amount) && extract?

    @balance -= amount
  end

  #Cuenta 1001 con saldo 100.0
  def to_s
    "Cuenta #{@id} con saldo #{@balance}"
  end
  private :create, :amount_valid, :extract?
end
