class OrderSummary {

  OrderSummary(String name, int quantity, double total) {
    this.name = name;
    this.quantity = quantity;
    this.total = total;
  }

  String name;
  int quantity;
  double total;

  @Override
  public String toString() {
    return "You've purshased " + this.name + " for $" + this.total;
  }
}

abstract class Payment {

  abstract OrderSummary pay();
}

class Stripe extends Payment {

  OrderSummary pay() {
    return new OrderSummary("keyboard", 1, 250.0);
  }
}

class Paypal extends Payment {

  OrderSummary pay() {
    return new OrderSummary("graphic card", 1, 55000.0);
  }
}

class Main {

  public static void main(String[] arg) {
    Stripe payment_1 = new Stripe();
    Paypal payment_2 = new Paypal();
    System.out.println(payment_1.pay());
    System.out.println(payment_2.pay());
  }
}
