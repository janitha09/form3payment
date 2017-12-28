/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;

/**
 *
 * @author janitha_j
 */
//class Payment {
//    private String id;
//    private String currency;
//    private String organisation_id;
//
//    /**
//     * @return the id
//     */
//    public String getId() {
//        return id;
//    }
//
//    /**
//     * @param id the id to set
//     */
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    /**
//     * @return the currency
//     */
//    public String getCurrency() {
//        return currency;
//    }
//
//    /**
//     * @param currency the currency to set
//     */
//    public void setCurrency(String currency) {
//        this.currency = currency;
//    }
//
//    /**
//     * @return the organisation_id
//     */
//    public String getOrganisation_id() {
//        return organisation_id;
//    }
//
//    /**
//     * @param organisation_id the organisation_id to set
//     */
//    public void setOrganisation_id(String organisation_id) {
//        this.organisation_id = organisation_id;
//    }
//}

public class Payment {

    private String id;//"id":"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43",
    private String version;//"version":0,
    private String organisation_id;//"organisation_id":"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb",
    private Attributes attributes;
    private String currency; //"currency":"GBP",
    private String end_to_end_reference;//":"Wil piano Jan",
    private String numeric_reference;//:"1002001",
    private String payment_id;//":"123456789012345678",
    private String payment_purpose;//":"Paying for goods/services",
    private String payment_scheme;//":"FPS",
    private String payment_type;//":"Credit",
    private String processing_date;//":"2017-01-18",
    private String reference;//":"Payment for Em's piano lessons",
    private String scheme_payment_sub_type;//":"InternetBanking",
    private String scheme_payment_type;//":"ImmediatePayment",
    private BeneficiaryParty beneficiaryParty;
    private ChargesInformation chargeInformation;
    private Datum datum;
    private DebtorParty debtorParty;
    private Fx fx;
    private SenderCharge senderCharge;
    private SponsorParty sponsorParty;


    static class Attributes {

        /**
         * The Amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String amount = "";
        private BeneficiaryParty beneficiaryParty;
        private ChargesInformation chargesInformation;
        /**
         * The Currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String currency = "";
        private DebtorParty debtorParty;
        /**
         * The End_to_end_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String endToEndReference = "";
        private Fx fx;
        /**
         * The Numeric_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String numericReference = "";
        /**
         * The Payment_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String paymentId = "";
        /**
         * The Payment_purpose Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String paymentPurpose = "";
        /**
         * The Payment_scheme Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String paymentScheme = "";
        /**
         * The Payment_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String paymentType = "";
        /**
         * The Processing_date Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String processingDate = "";
        /**
         * The Reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String reference = "";
        /**
         * The Scheme_payment_sub_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String schemePaymentSubType = "";
        /**
         * The Scheme_payment_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String schemePaymentType = "";
        private SponsorParty sponsorParty;

        /**
         * The Amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAmount() {
            return amount;
        }

        /**
         * The Amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAmount(String amount) {
            this.amount = amount;
        }

        public BeneficiaryParty getBeneficiaryParty() {
            return beneficiaryParty;
        }

        public void setBeneficiaryParty(BeneficiaryParty beneficiaryParty) {
            this.beneficiaryParty = beneficiaryParty;
        }

        public ChargesInformation getChargesInformation() {
            return chargesInformation;
        }

        public void setChargesInformation(ChargesInformation chargesInformation) {
            this.chargesInformation = chargesInformation;
        }

        /**
         * The Currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * The Currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public DebtorParty getDebtorParty() {
            return debtorParty;
        }

        public void setDebtorParty(DebtorParty debtorParty) {
            this.debtorParty = debtorParty;
        }

        /**
         * The End_to_end_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getEndToEndReference() {
            return endToEndReference;
        }

        /**
         * The End_to_end_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setEndToEndReference(String endToEndReference) {
            this.endToEndReference = endToEndReference;
        }

        public Fx getFx() {
            return fx;
        }

        public void setFx(Fx fx) {
            this.fx = fx;
        }

        /**
         * The Numeric_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getNumericReference() {
            return numericReference;
        }

        /**
         * The Numeric_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setNumericReference(String numericReference) {
            this.numericReference = numericReference;
        }

        /**
         * The Payment_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getPaymentId() {
            return paymentId;
        }

        /**
         * The Payment_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setPaymentId(String paymentId) {
            this.paymentId = paymentId;
        }

        /**
         * The Payment_purpose Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getPaymentPurpose() {
            return paymentPurpose;
        }

        /**
         * The Payment_purpose Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setPaymentPurpose(String paymentPurpose) {
            this.paymentPurpose = paymentPurpose;
        }

        /**
         * The Payment_scheme Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getPaymentScheme() {
            return paymentScheme;
        }

        /**
         * The Payment_scheme Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setPaymentScheme(String paymentScheme) {
            this.paymentScheme = paymentScheme;
        }

        /**
         * The Payment_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * The Payment_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        /**
         * The Processing_date Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getProcessingDate() {
            return processingDate;
        }

        /**
         * The Processing_date Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setProcessingDate(String processingDate) {
            this.processingDate = processingDate;
        }

        /**
         * The Reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getReference() {
            return reference;
        }

        /**
         * The Reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setReference(String reference) {
            this.reference = reference;
        }

        /**
         * The Scheme_payment_sub_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getSchemePaymentSubType() {
            return schemePaymentSubType;
        }

        /**
         * The Scheme_payment_sub_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setSchemePaymentSubType(String schemePaymentSubType) {
            this.schemePaymentSubType = schemePaymentSubType;
        }

        /**
         * The Scheme_payment_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getSchemePaymentType() {
            return schemePaymentType;
        }

        /**
         * The Scheme_payment_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setSchemePaymentType(String schemePaymentType) {
            this.schemePaymentType = schemePaymentType;
        }

        public SponsorParty getSponsorParty() {
            return sponsorParty;
        }

        public void setSponsorParty(SponsorParty sponsorParty) {
            this.sponsorParty = sponsorParty;
        }

    }

    static class BeneficiaryParty {

        /**
         * The Account_name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountName = "";
        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountNumber = "";
        /**
         * The Account_number_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountNumberCode = "";
        /**
         * The Account_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private Integer accountType = 0;
        /**
         * The Address Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String address = "";
        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bankId = "";
        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bankIdCode = "";
        /**
         * The Name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String name = "";

        /**
         * The Account_name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountName() {
            return accountName;
        }

        /**
         * The Account_name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        /**
         * The Account_number_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountNumberCode() {
            return accountNumberCode;
        }

        /**
         * The Account_number_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountNumberCode(String accountNumberCode) {
            this.accountNumberCode = accountNumberCode;
        }

        /**
         * The Account_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public Integer getAccountType() {
            return accountType;
        }

        /**
         * The Account_type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountType(Integer accountType) {
            this.accountType = accountType;
        }

        /**
         * The Address Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAddress() {
            return address;
        }

        /**
         * The Address Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAddress(String address) {
            this.address = address;
        }

        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBankId() {
            return bankId;
        }

        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBankId(String bankId) {
            this.bankId = bankId;
        }

        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBankIdCode() {
            return bankIdCode;
        }

        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBankIdCode(String bankIdCode) {
            this.bankIdCode = bankIdCode;
        }

        /**
         * The Name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getName() {
            return name;
        }

        /**
         * The Name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    static class ChargesInformation {

        /**
         * The Bearer_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bearerCode = "";
        private List<SenderCharge> senderCharges = null;
        /**
         * The Receiver_charges_amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String receiverChargesAmount = "";
        /**
         * The Receiver_charges_currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String receiverChargesCurrency = "";

        /**
         * The Bearer_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBearerCode() {
            return bearerCode;
        }

        /**
         * The Bearer_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBearerCode(String bearerCode) {
            this.bearerCode = bearerCode;
        }

        public List<SenderCharge> getSenderCharges() {
            return senderCharges;
        }

        public void setSenderCharges(List<SenderCharge> senderCharges) {
            this.senderCharges = senderCharges;
        }

        /**
         * The Receiver_charges_amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getReceiverChargesAmount() {
            return receiverChargesAmount;
        }

        /**
         * The Receiver_charges_amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setReceiverChargesAmount(String receiverChargesAmount) {
            this.receiverChargesAmount = receiverChargesAmount;
        }

        /**
         * The Receiver_charges_currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getReceiverChargesCurrency() {
            return receiverChargesCurrency;
        }

        /**
         * The Receiver_charges_currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setReceiverChargesCurrency(String receiverChargesCurrency) {
            this.receiverChargesCurrency = receiverChargesCurrency;
        }

    }

    static class Datum {

        /**
         * The Type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String type = "";
        /**
         * The Id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String id = "";
        /**
         * The Version Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private Integer version = 0;
        /**
         * The Organisation_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String organisationId = "";
        private Attributes attributes;

        /**
         * The Type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getType() {
            return type;
        }

        /**
         * The Type Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * The Id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getId() {
            return id;
        }

        /**
         * The Id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * The Version Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public Integer getVersion() {
            return version;
        }

        /**
         * The Version Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setVersion(Integer version) {
            this.version = version;
        }

        /**
         * The Organisation_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getOrganisationId() {
            return organisationId;
        }

        /**
         * The Organisation_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setOrganisationId(String organisationId) {
            this.organisationId = organisationId;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }

    }

    static class DebtorParty {

        /**
         * The Account_name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountName = "";
        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountNumber = "";
        /**
         * The Account_number_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountNumberCode = "";
        /**
         * The Address Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String address = "";
        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bankId = "";
        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bankIdCode = "";
        /**
         * The Name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String name = "";

        /**
         * The Account_name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountName() {
            return accountName;
        }

        /**
         * The Account_name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        /**
         * The Account_number_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountNumberCode() {
            return accountNumberCode;
        }

        /**
         * The Account_number_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountNumberCode(String accountNumberCode) {
            this.accountNumberCode = accountNumberCode;
        }

        /**
         * The Address Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAddress() {
            return address;
        }

        /**
         * The Address Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAddress(String address) {
            this.address = address;
        }

        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBankId() {
            return bankId;
        }

        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBankId(String bankId) {
            this.bankId = bankId;
        }

        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBankIdCode() {
            return bankIdCode;
        }

        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBankIdCode(String bankIdCode) {
            this.bankIdCode = bankIdCode;
        }

        /**
         * The Name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getName() {
            return name;
        }

        /**
         * The Name Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setName(String name) {
            this.name = name;
        }

    }

    static class Fx {

        /**
         * The Contract_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String contractReference = "";
        /**
         * The Exchange_rate Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String exchangeRate = "";
        /**
         * The Original_amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String originalAmount = "";
        /**
         * The Original_currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String originalCurrency = "";

        /**
         * The Contract_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getContractReference() {
            return contractReference;
        }

        /**
         * The Contract_reference Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setContractReference(String contractReference) {
            this.contractReference = contractReference;
        }

        /**
         * The Exchange_rate Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getExchangeRate() {
            return exchangeRate;
        }

        /**
         * The Exchange_rate Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setExchangeRate(String exchangeRate) {
            this.exchangeRate = exchangeRate;
        }

        /**
         * The Original_amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getOriginalAmount() {
            return originalAmount;
        }

        /**
         * The Original_amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
        }

        /**
         * The Original_currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getOriginalCurrency() {
            return originalCurrency;
        }

        /**
         * The Original_currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setOriginalCurrency(String originalCurrency) {
            this.originalCurrency = originalCurrency;
        }

    }

    static class SenderCharge {

        /**
         * The Amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String amount = "";
        /**
         * The Currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String currency = "";

        /**
         * The Amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAmount() {
            return amount;
        }

        /**
         * The Amount Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAmount(String amount) {
            this.amount = amount;
        }

        /**
         * The Currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * The Currency Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setCurrency(String currency) {
            this.currency = currency;
        }

    }

    static class SponsorParty {

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String accountNumber = "";
        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bankId = "";
        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        private String bankIdCode = "";

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * The Account_number Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBankId() {
            return bankId;
        }

        /**
         * The Bank_id Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBankId(String bankId) {
            this.bankId = bankId;
        }

        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public String getBankIdCode() {
            return bankIdCode;
        }

        /**
         * The Bank_id_code Schema.
         * <p>
         * An explanation about the purpose of this instance.
         *
         */
        public void setBankIdCode(String bankIdCode) {
            this.bankIdCode = bankIdCode;
        }

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the organisation_id
     */
    public String getOrganisation_id() {
        return organisation_id;
    }

    /**
     * @param organisation_id the organisation_id to set
     */
    public void setOrganisation_id(String organisation_id) {
        this.organisation_id = organisation_id;
    }

    /**
     * @return the attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the end_to_end_reference
     */
    public String getEnd_to_end_reference() {
        return end_to_end_reference;
    }

    /**
     * @param end_to_end_reference the end_to_end_reference to set
     */
    public void setEnd_to_end_reference(String end_to_end_reference) {
        this.end_to_end_reference = end_to_end_reference;
    }

    /**
     * @return the numeric_reference
     */
    public String getNumeric_reference() {
        return numeric_reference;
    }

    /**
     * @param numeric_reference the numeric_reference to set
     */
    public void setNumeric_reference(String numeric_reference) {
        this.numeric_reference = numeric_reference;
    }

    /**
     * @return the payment_id
     */
    public String getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @return the payment_purpose
     */
    public String getPayment_purpose() {
        return payment_purpose;
    }

    /**
     * @param payment_purpose the payment_purpose to set
     */
    public void setPayment_purpose(String payment_purpose) {
        this.payment_purpose = payment_purpose;
    }

    /**
     * @return the payment_scheme
     */
    public String getPayment_scheme() {
        return payment_scheme;
    }

    /**
     * @param payment_scheme the payment_scheme to set
     */
    public void setPayment_scheme(String payment_scheme) {
        this.payment_scheme = payment_scheme;
    }

    /**
     * @return the payment_type
     */
    public String getPayment_type() {
        return payment_type;
    }

    /**
     * @param payment_type the payment_type to set
     */
    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    /**
     * @return the processing_date
     */
    public String getProcessing_date() {
        return processing_date;
    }

    /**
     * @param processing_date the processing_date to set
     */
    public void setProcessing_date(String processing_date) {
        this.processing_date = processing_date;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the scheme_payment_sub_type
     */
    public String getScheme_payment_sub_type() {
        return scheme_payment_sub_type;
    }

    /**
     * @param scheme_payment_sub_type the scheme_payment_sub_type to set
     */
    public void setScheme_payment_sub_type(String scheme_payment_sub_type) {
        this.scheme_payment_sub_type = scheme_payment_sub_type;
    }

    /**
     * @return the scheme_payment_type
     */
    public String getScheme_payment_type() {
        return scheme_payment_type;
    }

    /**
     * @param scheme_payment_type the scheme_payment_type to set
     */
    public void setScheme_payment_type(String scheme_payment_type) {
        this.scheme_payment_type = scheme_payment_type;
    }

    /**
     * @return the beneficiaryParty
     */
    public BeneficiaryParty getBeneficiaryParty() {
        return beneficiaryParty;
    }

    /**
     * @param beneficiaryParty the beneficiaryParty to set
     */
    public void setBeneficiaryParty(BeneficiaryParty beneficiaryParty) {
        this.beneficiaryParty = beneficiaryParty;
    }

    /**
     * @return the chargeInformation
     */
    public ChargesInformation getChargeInformation() {
        return chargeInformation;
    }

    /**
     * @param chargeInformation the chargeInformation to set
     */
    public void setChargeInformation(ChargesInformation chargeInformation) {
        this.chargeInformation = chargeInformation;
    }

    /**
     * @return the datum
     */
    public Datum getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    /**
     * @return the debtorParty
     */
    public DebtorParty getDebtorParty() {
        return debtorParty;
    }

    /**
     * @param debtorParty the debtorParty to set
     */
    public void setDebtorParty(DebtorParty debtorParty) {
        this.debtorParty = debtorParty;
    }

    /**
     * @return the fx
     */
    public Fx getFx() {
        return fx;
    }

    /**
     * @param fx the fx to set
     */
    public void setFx(Fx fx) {
        this.fx = fx;
    }

    /**
     * @return the senderCharge
     */
    public SenderCharge getSenderCharge() {
        return senderCharge;
    }

    /**
     * @param senderCharge the senderCharge to set
     */
    public void setSenderCharge(SenderCharge senderCharge) {
        this.senderCharge = senderCharge;
    }

    /**
     * @return the sponsorParty
     */
    public SponsorParty getSponsorParty() {
        return sponsorParty;
    }

    /**
     * @param sponsorParty the sponsorParty to set
     */
    public void setSponsorParty(SponsorParty sponsorParty) {
        this.sponsorParty = sponsorParty;
    }

}

