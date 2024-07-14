package org.example.hwjzmaven2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationServiceTest {

    @Test
    public void shouldCalcExpect() {
        VacationService service = new VacationService();
        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        //вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // проводим проверку( сравниваем ожидаемый и фактический р-т):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCalcPact() {
        VacationService service = new VacationService();

        // подшотавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        //вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}


