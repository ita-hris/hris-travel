package com.itechart.hris.hristravel.service.scheduler;

import com.itechart.hris.hristravel.service.integration.Currency;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private final Currency currency;

    public ScheduledTasks(Currency currency) {
        this.currency = currency;
    }

    @Scheduled(cron = "0 0 12 * * MON-FRI")
    public void updateCurrencyRate() {
        currency.updateCurrencyRate();
    }

    @Scheduled(cron = "0 0 11 * * MON-FRI")
    public void updateCurrency() {
        currency.updateCurrency();
    }
}
