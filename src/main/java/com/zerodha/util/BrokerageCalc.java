package com.zerodha.util;

public class BrokerageCalc {

	public double getChargesIntradayCash(double buyPrice, double sellPrice, int quantity) {
		double netBuy = 0.0, netSell = 0.0, profit = 0.0, turnOver = 0.0,
				stt = 0.0, brokerage = 0.0, txnCharge = 0.0, gst = 0.0, stampDuty = 0.0,
				sebi = 0.0, totalTax = 0.0;
		netBuy = Math.round(buyPrice * quantity * 100) / 100.0;
		netSell = Math.round(sellPrice * quantity * 100) / 100.0;
		profit = Math.round((netSell - netBuy) * 100) / 100.0;
		turnOver = Math.round((netBuy + netSell) * 100) / 100.0;
		stt = Math.ceil(Math.round(netSell * 0.025) / 100.0);
		brokerage = turnOver * 0.0001 > 40 ? 40 : Math.round(turnOver * 0.01) / 100.0;
		txnCharge = Math.round(turnOver * 0.00325) / 100.0;
		gst = Math.round((brokerage + txnCharge) * 0.18 * 100) / 100.0;
		stampDuty = Math.round(turnOver * 0.002) / 100.0;
		sebi = Math.round(turnOver * 0.00020) / 100.0;
		totalTax = Math.round((stt + brokerage + txnCharge + gst + stampDuty + sebi) * 100) / 100.0;
		profit = Math.floor(profit - totalTax);
		return totalTax;
	}

	public double getChargesIntradayFuture(double buyPrice, double sellPrice, int quantity) {
		double netBuy = 0.0, netSell = 0.0, profit = 0.0, turnOver = 0.0,
				stt = 0.0, brokerage = 0.0, txnCharge = 0.0, gst = 0.0, stampDuty = 0.0,
				sebi = 0.0, totalTax = 0.0;
		netBuy = Math.round(buyPrice * quantity * 100) / 100.0;
		netSell = Math.round(sellPrice * quantity * 100) / 100.0;
		profit = Math.round((netSell - netBuy) * 100) / 100.0;
		turnOver = Math.round((netBuy + netSell) * 100) / 100.0;
		stt = Math.ceil(Math.round(netSell * 0.01) / 100.0);
		brokerage = turnOver * 0.0001 > 40 ? 40 : Math.round(turnOver * 0.01) / 100.0;
		txnCharge = Math.round(turnOver * 0.0021) / 100.0;
		gst = Math.round((brokerage + txnCharge) * 0.18 * 100) / 100.0;
		stampDuty = Math.round(turnOver * 0.002) / 100.0;
		sebi = Math.round(turnOver * 0.00020) / 100.0;
		totalTax = Math.round((stt + brokerage + txnCharge + gst + stampDuty + sebi) * 100) / 100.0;
		profit = Math.floor(profit - totalTax);
		return totalTax;
	}
	
	public double getChargesIntradayOption(double buyPrice, double sellPrice, int quantity) {
		double netBuy = 0.0, netSell = 0.0, profit = 0.0, turnOver = 0.0,
				stt = 0.0, brokerage = 0.0, txnCharge = 0.0, gst = 0.0, stampDuty = 0.0,
				sebi = 0.0, totalTax = 0.0;
		netBuy = Math.round(buyPrice * quantity * 100) / 100.0;
		netSell = Math.round(sellPrice * quantity * 100) / 100.0;
		profit = Math.round((netSell - netBuy) * 100) / 100.0;
		turnOver = Math.round((netBuy + netSell) * 100) / 100.0;
		stt = Math.ceil(Math.round(netSell * 0.05) / 100.0);
		brokerage = turnOver * 0.0001 > 40 ? 40 : Math.round(turnOver * 0.01) / 100.0;
		txnCharge = Math.round(turnOver * 0.052) / 100.0;
		gst = Math.round((brokerage + txnCharge) * 0.18 * 100) / 100.0;
		stampDuty = Math.round(turnOver * 0.002) / 100;
		sebi = Math.round(turnOver * 0.00020) / 100.0;
		totalTax = Math.round((stt + brokerage + txnCharge + gst + stampDuty + sebi) * 100) / 100.0;
		profit = Math.floor(profit - totalTax);
		return totalTax;
	}
	

}
