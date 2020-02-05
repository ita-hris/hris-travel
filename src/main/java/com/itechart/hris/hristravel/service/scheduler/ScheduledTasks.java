package com.itechart.hris.hristravel.service.scheduler;

import com.itechart.hris.hristravel.service.integration.CurrencyIntegrationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private final CurrencyIntegrationService currencyIntegrationService;

    public ScheduledTasks(CurrencyIntegrationService currencyIntegrationService) {
        this.currencyIntegrationService = currencyIntegrationService;
    }

    @Scheduled(cron = "0 0 12 * * MON-FRI")
    public void updateCurrencyRate() {
        currencyIntegrationService.updateCurrencyRate();
    }

    @Scheduled(cron = "0 0 11 * * MON-FRI")
    public void updateCurrency() {
        currencyIntegrationService.saveCurrencyIfNotExist();
    }
}
