package com.alfaris.esb.dto;

public class AccountDetails {

	private String acctType;

	private String accountCurrency;

	private String isoCurrencyCode;

	private String accountNumber;

	private String accountRelationCode;

	private String availableBalance;

	private String acctProdType;

	private String accountStatusCd;

	private String nameLanguageCode;

	private String acctNameAddress1;

	public AccountDetails(String acctType, String accountCurrency, String isoCurrencyCode, String accountNumber,
			String accountRelationCode, String availableBalance, String acctProdType, String accountStatusCd,
			String nameLanguageCode, String acctNameAddress1) {
		super();
		this.acctType = acctType;
		this.accountCurrency = accountCurrency;
		this.isoCurrencyCode = isoCurrencyCode;
		this.accountNumber = accountNumber;
		this.accountRelationCode = accountRelationCode;
		this.availableBalance = availableBalance;
		this.acctProdType = acctProdType;
		this.accountStatusCd = accountStatusCd;
		this.nameLanguageCode = nameLanguageCode;
		this.acctNameAddress1 = acctNameAddress1;
	}

//	@JsonProperty("Acct_Type")
//	private String Acct_Type;
//	@JsonProperty("Account_Currency")
//	private String Account_Currency;
//	@JsonProperty("ISO_Currency_Code")
//	private String ISO_Currency_Code;
//	@JsonProperty("Account_Number")
//	private String Account_Number;
//	@JsonProperty("Account_Relation_Code")
//	private String Account_Relation_Code;
//	@JsonProperty("Available_Balance")
//	private String Available_Balance;
//	@JsonProperty("Acct_Prod_Type")
//	private String Acct_Prod_Type;
//	@JsonProperty("Account_Status_Cd")
//	private String Account_Status_Cd;
//	@JsonProperty("Name_Language_Code")
//	private String Name_Language_Code;
//	@JsonProperty("Acct_Name_Address_1")
//	private String Acct_Name_Address_1;
//	@JsonProperty("Acct_Name_Address_2")
//	private String Acct_Name_Address_2;
//
//	public String getAcct_Type() {
//		return Acct_Type;
//	}
//
//	public void setAcct_Type(String acct_Type) {
//		Acct_Type = acct_Type;
//	}
//
//	public String getAccount_Currency() {
//		return Account_Currency;
//	}
//
//	public void setAccount_Currency(String account_Currency) {
//		Account_Currency = account_Currency;
//	}
//
//	public String getISO_Currency_Code() {
//		return ISO_Currency_Code;
//	}
//
//	public void setISO_Currency_Code(String iSO_Currency_Code) {
//		ISO_Currency_Code = iSO_Currency_Code;
//	}
//
//	public String getAccount_Number() {
//		return Account_Number;
//	}
//
//	public void setAccount_Number(String account_Number) {
//		Account_Number = account_Number;
//	}
//
//	public String getAccount_Relation_Code() {
//		return Account_Relation_Code;
//	}
//
//	public void setAccount_Relation_Code(String account_Relation_Code) {
//		Account_Relation_Code = account_Relation_Code;
//	}
//
//	public String getAvailable_Balance() {
//		return Available_Balance;
//	}
//
//	public void setAvailable_Balance(String available_Balance) {
//		Available_Balance = available_Balance;
//	}
//
//	public String getAcct_Prod_Type() {
//		return Acct_Prod_Type;
//	}
//
//	public void setAcct_Prod_Type(String acct_Prod_Type) {
//		Acct_Prod_Type = acct_Prod_Type;
//	}
//
//	public String getAccount_Status_Cd() {
//		return Account_Status_Cd;
//	}
//
//	public void setAccount_Status_Cd(String account_Status_Cd) {
//		Account_Status_Cd = account_Status_Cd;
//	}
//
//	public String getName_Language_Code() {
//		return Name_Language_Code;
//	}
//
//	public void setName_Language_Code(String name_Language_Code) {
//		Name_Language_Code = name_Language_Code;
//	}
//
//	public String getAcct_Name_Address_1() {
//		return Acct_Name_Address_1;
//	}
//
//	public void setAcct_Name_Address_1(String acct_Name_Address_1) {
//		Acct_Name_Address_1 = acct_Name_Address_1;
//	}
//
//	public String getAcct_Name_Address_2() {
//		return Acct_Name_Address_2;
//	}
//
//	public void setAcct_Name_Address_2(String acct_Name_Address_2) {
//		Acct_Name_Address_2 = acct_Name_Address_2;
//	}
//
//	@Override
//	public String toString() {
//		return "AccountDetails [Acct_Type=" + Acct_Type + ", Account_Currency=" + Account_Currency
//				+ ", ISO_Currency_Code=" + ISO_Currency_Code + ", Account_Number=" + Account_Number
//				+ ", Account_Relation_Code=" + Account_Relation_Code + ", Available_Balance=" + Available_Balance
//				+ ", Acct_Prod_Type=" + Acct_Prod_Type + ", Account_Status_Cd=" + Account_Status_Cd
//				+ ", Name_Language_Code=" + Name_Language_Code + ", Acct_Name_Address_1=" + Acct_Name_Address_1
//				+ ", Acct_Name_Address_2=" + Acct_Name_Address_2 + "]";
//	}
//
//	public AccountDetails(String acct_Type, String account_Currency, String iSO_Currency_Code, String account_Number,
//			String account_Relation_Code, String available_Balance, String acct_Prod_Type, String account_Status_Cd,
//			String name_Language_Code, String acct_Name_Address_1, String acct_Name_Address_2) {
//		super();
//		Acct_Type = acct_Type;
//		Account_Currency = account_Currency;
//		ISO_Currency_Code = iSO_Currency_Code;
//		Account_Number = account_Number;
//		Account_Relation_Code = account_Relation_Code;
//		Available_Balance = available_Balance;
//		Acct_Prod_Type = acct_Prod_Type;
//		Account_Status_Cd = account_Status_Cd;
//		Name_Language_Code = name_Language_Code;
//		Acct_Name_Address_1 = acct_Name_Address_1;
//		Acct_Name_Address_2 = acct_Name_Address_2;
//	}

	@Override
	public String toString() {
		return "AccountDetails [acctType=" + acctType + ", accountCurrency=" + accountCurrency + ", isoCurrencyCode="
				+ isoCurrencyCode + ", accountNumber=" + accountNumber + ", accountRelationCode=" + accountRelationCode
				+ ", availableBalance=" + availableBalance + ", acctProdType=" + acctProdType + ", accountStatusCd="
				+ accountStatusCd + ", nameLanguageCode=" + nameLanguageCode + ", acctNameAddress1=" + acctNameAddress1
				+ "]";
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountRelationCode() {
		return accountRelationCode;
	}

	public void setAccountRelationCode(String accountRelationCode) {
		this.accountRelationCode = accountRelationCode;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getAcctProdType() {
		return acctProdType;
	}

	public void setAcctProdType(String acctProdType) {
		this.acctProdType = acctProdType;
	}

	public String getAccountStatusCd() {
		return accountStatusCd;
	}

	public void setAccountStatusCd(String accountStatusCd) {
		this.accountStatusCd = accountStatusCd;
	}

	public String getNameLanguageCode() {
		return nameLanguageCode;
	}

	public void setNameLanguageCode(String nameLanguageCode) {
		this.nameLanguageCode = nameLanguageCode;
	}

	public String getAcctNameAddress1() {
		return acctNameAddress1;
	}

	public void setAcctNameAddress1(String acctNameAddress1) {
		this.acctNameAddress1 = acctNameAddress1;
	}

	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
