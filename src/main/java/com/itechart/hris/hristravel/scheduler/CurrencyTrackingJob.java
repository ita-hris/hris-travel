package com.itechart.hris.hristravel.scheduler;

import com.itechart.hris.hristravel.service.integration.CurrencyIntegrationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * This methods starts by schedule.
 * updateCurrencyRate() - update rate of currencies every workday on 12 am
 * updateCurrency() - update list of currencies every workday on 11 am
 */
@Component
public class CurrencyTrackingJob {

    private final CurrencyIntegrationService currencyIntegrationService;

    public CurrencyTrackingJob(CurrencyIntegrationService currencyIntegrationService) {
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
