package lab7;

public class FinancialCalculator implements Computable<Double, Double> {
  @Override
  public Double add(Double i1, Double i2) {
    return i1 + i2;
  }

  @Override
  public Double sub(Double i1, Double i2) {
    return i1 - i2;
  }

  @Override
  public Double mul(Double i1, Double i2) {
    return i1 * i2;
  }

  @Override
  public Double div(Double i1, Double i2) {
    return i1 / i2;
  }

  @Override
  public Double mod(Double i1, Double i2) {
    return i1 % i2;
  }
}
