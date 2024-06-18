package com.alfaris.esb.dto;

public class CustomerDetails {

	private String cisNumber;

	private String custFullName;

	private String nameLangCd;

	private String displayAddress;

	private String phoneTypeCd;

	private String phoneNumber;

	private String poBox;

	private String address1;

	private String idType;

	private String addressCity;

	private String zip;

	private String custId;

	private String idDateType;

	private String idExpiryDate;

	private String openingBranch;

	private String responsibleBranch;

	private String officerCd;

	private String officerName;

	private String custSubTypeCd;

	private String citizenshipCountryCd;

	public CustomerDetails(String cisNumber, String custFullName, String nameLangCd, String displayAddress,
			String phoneTypeCd, String phoneNumber, String poBox, String address1, String idType, String addressCity,
			String zip, String custId, String idDateType, String idExpiryDate, String openingBranch,
			String responsibleBranch, String officerCd, String officerName, String custSubTypeCd,
			String citizenshipCountryCd) {
		super();
		this.cisNumber = cisNumber;
		this.custFullName = custFullName;
		this.nameLangCd = nameLangCd;
		this.displayAddress = displayAddress;
		this.phoneTypeCd = phoneTypeCd;
		this.phoneNumber = phoneNumber;
		this.poBox = poBox;
		this.address1 = address1;
		this.idType = idType;
		this.addressCity = addressCity;
		this.zip = zip;
		this.custId = custId;
		this.idDateType = idDateType;
		this.idExpiryDate = idExpiryDate;
		this.openingBranch = openingBranch;
		this.responsibleBranch = responsibleBranch;
		this.officerCd = officerCd;
		this.officerName = officerName;
		this.custSubTypeCd = custSubTypeCd;
		this.citizenshipCountryCd = citizenshipCountryCd;
	}

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public String getCustFullName() {
		return custFullName;
	}

	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}

	public String getNameLangCd() {
		return nameLangCd;
	}

	public void setNameLangCd(String nameLangCd) {
		this.nameLangCd = nameLangCd;
	}

	public String getDisplayAddress() {
		return displayAddress;
	}

	public void setDisplayAddress(String displayAddress) {
		this.displayAddress = displayAddress;
	}

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getIdDateType() {
		return idDateType;
	}

	public void setIdDateType(String idDateType) {
		this.idDateType = idDateType;
	}

	public String getIdExpiryDate() {
		return idExpiryDate;
	}

	public void setIdExpiryDate(String idExpiryDate) {
		this.idExpiryDate = idExpiryDate;
	}

	public String getOpeningBranch() {
		return openingBranch;
	}

	public void setOpeningBranch(String openingBranch) {
		this.openingBranch = openingBranch;
	}

	public String getResponsibleBranch() {
		return responsibleBranch;
	}

	public void setResponsibleBranch(String responsibleBranch) {
		this.responsibleBranch = responsibleBranch;
	}

	public String getOfficerCd() {
		return officerCd;
	}

	public void setOfficerCd(String officerCd) {
		this.officerCd = officerCd;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getCustSubTypeCd() {
		return custSubTypeCd;
	}

	public void setCustSubTypeCd(String custSubTypeCd) {
		this.custSubTypeCd = custSubTypeCd;
	}

	public String getCitizenshipCountryCd() {
		return citizenshipCountryCd;
	}

	public void setCitizenshipCountryCd(String citizenshipCountryCd) {
		this.citizenshipCountryCd = citizenshipCountryCd;
	}

	// @JsonProperty("CIS_Number")
//    private Value CIS_Number;
//	@JsonProperty("Cust_Full_Name")
//    private Value Cust_Full_Name;
//	@JsonProperty("Name_Lang_Cd")
//    private Value Name_Lang_Cd;
//	@JsonProperty("Display_Address")
//    private Value Display_Address;
//	@JsonProperty("Phone_Type_Cd")
//    private Value Phone_Type_Cd;
//	@JsonProperty("Phone_Number")
//    private Value Phone_Number;
//	@JsonProperty("PO_Box")
//    private Value PO_Box;
//	@JsonProperty("Address_1")
//    private String Address_1;
//	@JsonProperty("Address_2")
//    private String Address_2;
//	@JsonProperty("Address_3")
//    private String Address_3;
//	@JsonProperty("Address_4")
//    private String Address_4;
//	@JsonProperty("Address_City")
//    private String Address_City;
//	@JsonProperty("Zip")
//    private String Zip;
//    @JsonProperty("ID_Type")
//    private Value ID_Type;
//    @JsonProperty("Cust_ID")
//    private Value Cust_ID;
//    @JsonProperty("ID_Date_Type")
//    private Value ID_Date_Type;
//    @JsonProperty("ID_Expiry_Date")
//    private Value ID_Expiry_Date;
//    @JsonProperty("Opening_Branch")
//    private Value Opening_Branch;
//    @JsonProperty("Responsible_Branch")
//    private Value Responsible_Branch;
//    @JsonProperty("Preferred_Branch")
//    private Value Preferred_Branch;
//    @JsonProperty("Officer_Cd")
//    private Value Officer_Cd;
//    @JsonProperty("Officer_Name")
//    private String Officer_Name;
//    @JsonProperty("Cust_Sub_Type_Cd")
//    private Value Cust_Sub_Type_Cd;
//    @JsonProperty("Citizenship_Country_Cd")
//    private Value Citizenship_Country_Cd;
//    
//	public Value getCIS_Number() {
//		return CIS_Number;
//	}
//	public void setCIS_Number(Value cIS_Number) {
//		CIS_Number = cIS_Number;
//	}
//	public Value getCust_Full_Name() {
//		return Cust_Full_Name;
//	}
//	public void setCust_Full_Name(Value cust_Full_Name) {
//		Cust_Full_Name = cust_Full_Name;
//	}
//	public Value getName_Lang_Cd() {
//		return Name_Lang_Cd;
//	}
//	public void setName_Lang_Cd(Value name_Lang_Cd) {
//		Name_Lang_Cd = name_Lang_Cd;
//	}
//	public Value getDisplay_Address() {
//		return Display_Address;
//	}
//	public void setDisplay_Address(Value display_Address) {
//		Display_Address = display_Address;
//	}
//	public Value getPhone_Type_Cd() {
//		return Phone_Type_Cd;
//	}
//	public void setPhone_Type_Cd(Value phone_Type_Cd) {
//		Phone_Type_Cd = phone_Type_Cd;
//	}
//	public Value getPhone_Number() {
//		return Phone_Number;
//	}
//	public void setPhone_Number(Value phone_Number) {
//		Phone_Number = phone_Number;
//	}
//	public Value getPO_Box() {
//		return PO_Box;
//	}
//	public void setPO_Box(Value pO_Box) {
//		PO_Box = pO_Box;
//	}
//	public String getAddress_1() {
//		return Address_1;
//	}
//	public void setAddress_1(String address_1) {
//		Address_1 = address_1;
//	}
//	public String getAddress_2() {
//		return Address_2;
//	}
//	public void setAddress_2(String address_2) {
//		Address_2 = address_2;
//	}
//	public String getAddress_3() {
//		return Address_3;
//	}
//	public void setAddress_3(String address_3) {
//		Address_3 = address_3;
//	}
//	public String getAddress_4() {
//		return Address_4;
//	}
//	public void setAddress_4(String address_4) {
//		Address_4 = address_4;
//	}
//	public String getAddress_City() {
//		return Address_City;
//	}
//	public void setAddress_City(String address_City) {
//		Address_City = address_City;
//	}
//	public String getZip() {
//		return Zip;
//	}
//	public void setZip(String zip) {
//		Zip = zip;
//	}
//	public Value getID_Type() {
//		return ID_Type;
//	}
//	public void setID_Type(Value iD_Type) {
//		ID_Type = iD_Type;
//	}
//	public Value getCust_ID() {
//		return Cust_ID;
//	}
//	public void setCust_ID(Value cust_ID) {
//		Cust_ID = cust_ID;
//	}
//	public Value getID_Date_Type() {
//		return ID_Date_Type;
//	}
//	public void setID_Date_Type(Value iD_Date_Type) {
//		ID_Date_Type = iD_Date_Type;
//	}
//	public Value getID_Expiry_Date() {
//		return ID_Expiry_Date;
//	}
//	public void setID_Expiry_Date(Value iD_Expiry_Date) {
//		ID_Expiry_Date = iD_Expiry_Date;
//	}
//	public Value getOpening_Branch() {
//		return Opening_Branch;
//	}
//	public void setOpening_Branch(Value opening_Branch) {
//		Opening_Branch = opening_Branch;
//	}
//	public Value getResponsible_Branch() {
//		return Responsible_Branch;
//	}
//	public void setResponsible_Branch(Value responsible_Branch) {
//		Responsible_Branch = responsible_Branch;
//	}
//	public Value getPreferred_Branch() {
//		return Preferred_Branch;
//	}
//	public void setPreferred_Branch(Value preferred_Branch) {
//		Preferred_Branch = preferred_Branch;
//	}
//	public Value getOfficer_Cd() {
//		return Officer_Cd;
//	}
//	public void setOfficer_Cd(Value officer_Cd) {
//		Officer_Cd = officer_Cd;
//	}
//	public String getOfficer_Name() {
//		return Officer_Name;
//	}
//	public void setOfficer_Name(String officer_Name) {
//		Officer_Name = officer_Name;
//	}
//	public Value getCust_Sub_Type_Cd() {
//		return Cust_Sub_Type_Cd;
//	}
//	public void setCust_Sub_Type_Cd(Value cust_Sub_Type_Cd) {
//		Cust_Sub_Type_Cd = cust_Sub_Type_Cd;
//	}
//	public Value getCitizenship_Country_Cd() {
//		return Citizenship_Country_Cd;
//	}
//	public void setCitizenship_Country_Cd(Value citizenship_Country_Cd) {
//		Citizenship_Country_Cd = citizenship_Country_Cd;
//	}
//	@Override
//	public String toString() {
//		return "CustomerDetails [CIS_Number=" + CIS_Number + ", Cust_Full_Name=" + Cust_Full_Name + ", Name_Lang_Cd="
//				+ Name_Lang_Cd + ", Display_Address=" + Display_Address + ", Phone_Type_Cd=" + Phone_Type_Cd
//				+ ", Phone_Number=" + Phone_Number + ", PO_Box=" + PO_Box + ", Address_1=" + Address_1 + ", Address_2="
//				+ Address_2 + ", Address_3=" + Address_3 + ", Address_4=" + Address_4 + ", Address_City=" + Address_City
//				+ ", Zip=" + Zip + ", ID_Type=" + ID_Type + ", Cust_ID=" + Cust_ID + ", ID_Date_Type=" + ID_Date_Type
//				+ ", ID_Expiry_Date=" + ID_Expiry_Date + ", Opening_Branch=" + Opening_Branch + ", Responsible_Branch="
//				+ Responsible_Branch + ", Preferred_Branch=" + Preferred_Branch + ", Officer_Cd=" + Officer_Cd
//				+ ", Officer_Name=" + Officer_Name + ", Cust_Sub_Type_Cd=" + Cust_Sub_Type_Cd
//				+ ", Citizenship_Country_Cd=" + Citizenship_Country_Cd + "]";
//	}
//	public CustomerDetails(Value cIS_Number, Value cust_Full_Name, Value name_Lang_Cd, Value display_Address,
//			Value phone_Type_Cd, Value phone_Number, Value pO_Box, String address_1, String address_2,
//			String address_3, String address_4, String address_City, String zip, Value iD_Type, Value cust_ID,
//			Value iD_Date_Type, Value iD_Expiry_Date, Value opening_Branch, Value responsible_Branch,
//			Value preferred_Branch, Value officer_Cd, String officer_Name, Value cust_Sub_Type_Cd,
//			Value citizenship_Country_Cd) {
//		super();
//		CIS_Number = cIS_Number;
//		Cust_Full_Name = cust_Full_Name;
//		Name_Lang_Cd = name_Lang_Cd;
//		Display_Address = display_Address;
//		Phone_Type_Cd = phone_Type_Cd;
//		Phone_Number = phone_Number;
//		PO_Box = pO_Box;
//		Address_1 = address_1;
//		Address_2 = address_2;
//		Address_3 = address_3;
//		Address_4 = address_4;
//		Address_City = address_City;
//		Zip = zip;
//		ID_Type = iD_Type;
//		Cust_ID = cust_ID;
//		ID_Date_Type = iD_Date_Type;
//		ID_Expiry_Date = iD_Expiry_Date;
//		Opening_Branch = opening_Branch;
//		Responsible_Branch = responsible_Branch;
//		Preferred_Branch = preferred_Branch;
//		Officer_Cd = officer_Cd;
//		Officer_Name = officer_Name;
//		Cust_Sub_Type_Cd = cust_Sub_Type_Cd;
//		Citizenship_Country_Cd = citizenship_Country_Cd;
//	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
