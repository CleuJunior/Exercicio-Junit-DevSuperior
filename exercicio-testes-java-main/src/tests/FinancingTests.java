package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());

    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                {
                    Financing f = new Financing(100000.0, 2000.0, 20);
                }
        );

    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData(){
        // arrange
        Financing f = new Financing(100000.0, 2000.0, 80);

        // action
        f.setTotalAmount(90000.0);

        // assert
        Assertions.assertEquals(90000.0, f.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                {
                    Financing f = new Financing(120000.0, 2000.0, 80);
                    f.setTotalAmount(120000.0);
                }
        );

    }

    @Test
    public void setIncomeShouldSetDataWhenValidData(){
        // arrange
        Financing f = new Financing(100000.0, 2000.0, 80);

        // action
        f.setIncome(2100.0);

        // assert
        Assertions.assertEquals(2100.0, f.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                {
                    Financing f = new Financing(120000.0, 2000.0, 80);
                    f.setIncome(1800.0);
                }
        );

    }

    @Test
    public void setMonthsShouldSetDataWhenValidData(){
        // arrange
        Financing f = new Financing(100000.0, 2000.0, 80);

        // action
        f.setMonths(83);

        // assert
        Assertions.assertEquals(83, f.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData(){

        Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                {
                    Financing f = new Financing(120000.0, 2000.0, 80);
                    f.setMonths(77);
                }
        );

    }

    @Test
    public void entryShouldCalculateEntryCorrectly(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(20000.0, f.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly(){
        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000.0, f.quota());
    }
}
