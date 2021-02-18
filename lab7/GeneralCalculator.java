package lab7;

public class GeneralCalculator implements Computable<Integer, Integer> {
  @Override
  public Integer add(Integer i1, Integer i2) {
    return i1 + i2;
  }

  @Override
  public Integer sub(Integer i1, Integer i2) {
    return i1 - i2;
  }

  @Override
  public Integer mul(Integer i1, Integer i2) {
    return i1 * i2;
  }

  @Override
  public Integer div(Integer i1, Integer i2) {
    return i1 / i2;
  }

  @Override
  public Integer mod(Integer i1, Integer i2) {
    return i1 % i2;
  }
}
