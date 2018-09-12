Feature: Update T&Cs copy wording on user registration journey

Background: 
	Given A user access "welcome" section of "everyday banking" application
    When A user clicks the "register" button on the "welcome" page 
    Then A user is redirected to the "register" page 
    Then A user enters "Firstname" in "your first name" field on the "register" page
    Then A user enters "Surname" in "Your surname" field on the "register" page
    Then A user enters "w2@w1.com" in "Your email address" field on the "register" page
    Then A user enters "Password@12" in "Set password" field on the "register" page
    Then A user enters "Password@12" in "Confirm your password" field on the "register" page
    When A user clicks the "Next" button on the "register" page
    When A user clicks the "Confirm details" button on the "register" page
    Then A user is redirected to the "tandc" page	
    
Scenario:
	Then A user should see "Title" with text 
	"""
	NATIONWIDE MONEY TERMS AND CONDITIONS
	"""
	Then A user should see "TitleBody1" with text 
	"""
This agreement is between Nationwide Building Society and you.
	"""
	Then A user should see "TitleBody2" with text 
	"""
Please read the terms and conditions below (the Terms). Click here if you would like a copy sent to you by email. We only use any personal information we obtain about you in the ways set out in our Privacy Policy. A copy of the Privacy Policy can be found here.
	"""
	Then A user should see "TitleBody3" with text
	"""
To find out more about how we may use cookies and similar technology on Nationwide's websites and digital services, please see our Cookie Policy.
	"""
	Then A user should see "TitleBody4" with text 
	"""
By clicking on 'accept', you agree to be bound by these Terms.
	"""
	Then A user should see "Header1" with text 
	"""
	PART 1: GENERAL TERMS
	"""
	Then A user should see "Header1Body1" with text 
	"""
1 Words we use
	"""
	Then A user should see "Header1Body2" with text 
	"""
1.1 In these Terms the following words and expressions have the following meanings: We, us, our and Nationwide refer to Nationwide Building Society, Nationwide House, Pipers Way, Swindon, Wiltshire, SN38 1NW. Nationwide Building Society is authorised by the Prudential Regulation Authority and regulated by the Financial Conduct Authority and Prudential Regulation Authority under registration number 106078. You can confirm our registration on the FCA's website, register.fca.org.uk or by contacting the FCA directly. Our VAT number is 485 9633 89. You and your refers to the person who registers to use Nationwide Money. Account means each online account held by you with a Provider and which you give us access to in order to provide the Services. Account Information means the information on your Accounts which we access from Providers in order to provide you with the Services. This will include your account numbers, product names (or any nicknames you have allocated to your Accounts), account balances, details of standing orders, direct debits and payees, and transaction history. Nationwide Money means the Nationwide application which you use in order to access the Services. Open Banking means the UK's Open Banking initiative, which Nationwide is a participant in. You can find out more information about Open Banking at www.openbanking.org.uk Provider means any bank or building society you hold an Account with, who has signed up to the Open Banking directory. Where you hold an Account with Nationwide and add this to Nationwide Money, Nationwide will also be a Provider for the purposes of these Terms. Services means the following services, as amended or added to from time to time in accordance with these Terms:
	"""
	Then A user should see "Header1Body3" with text 
	"""
(a) account information services, described in Part 2 of these Terms;
	"""
	Then A user should see "Header1Body4" with text
	"""
(b) payment initiation services, described in Part 3 of these Terms; and
	"""
	Then A user should see "Header1Body5" with text	
	"""
(c) such other services as we may provide through Nationwide Money from time to time. User Details means the information (such as a password) that you must provide in order to log into Nationwide Money. Working Day means any day which is not a Saturday or Sunday, or a Bank Holiday in England and Wales. Where there is a time difference between the UK and the country you are in, the Working Day in question for the purpose of these Terms will be determined by what day it is in the UK.
	"""
	Then A user should see "Header1Body6" with text	
	"""	
2 About these Terms
	"""
	Then A user should see "Header1Body7" with text	
	"""
2.1 References to the Terms includes any amendment to, addition to, or replacement of the Terms.
	"""
	Then A user should see "Header1Body8" with text	
	"""
2.2 Only you and we will have any rights under these Terms.
	"""
	Then A user should see "Header1Body9" with text	
	"""
2.3 These Terms apply to the Services we provide you. They do not affect or replace the terms and conditions that apply to your Accounts (including any Accounts you hold with us).
	"""
	Then A user should see "Header1Body10" with text
	"""
2.4 You will be able to view, download and print the current version of the Terms at any time on the Nationwide website.
	"""
	Then A user should see "Header1Body11" with text
	"""
3 Conditions for using Nationwide Money
	"""
	Then A user should see "Header1Body12" with text
	"""
3.1 You must be a UK resident in order to use Nationwide Money.
	"""
	Then A user should see "Header1Body13" with text
	"""
3.2 Where an Account is a joint account, then any of the joint account holders can register to use Nationwide Money in relation to that Account. We will only provide the Services to the joint account holder who has registered to use Nationwide Money. If another joint account holder wishes to use Nationwide Money, they will need to register separately.
	"""
	Then A user should see "Header1Body14" with text
	"""
3.3 In order for Nationwide Money to work, your device must be connected to the internet and must be running a compatible version of the operating system.
	"""
	Then A user should see "Header1Body15" with text
	"""
3.4 The functionality and features of Nationwide Money and the Services you can use may vary depending on the device you are using, the version of the operating system on your device and the version of Nationwide Money you are using.
	"""
	Then A user should see "Header1Body16" with text
	"""
3.5 If we detect that your device has been compromised in a way that may allow unauthorised or malicious software to be installed, or that it may carry a virus or any malware threat, we may prevent you accessing Nationwide Money using that device.
	"""
	Then A user should see "Header1Body17" with text
	"""
3.6 You must not alter or adapt any part of Nationwide Money or carry out any reverse engineering. You must not use Nationwide Money on a device or operating system that does not have supported or warranted configurations. This includes devices that have been ‘jailbroken’ or ‘rooted’. A jailbroken or rooted device is one which has had the limitations set by your mobile service provider and the phone manufacturer removed without their approval.
	"""
	Then A user should see "Header1Body18" with text
	"""
3.7 When using Nationwide Money, you will be prompted to provide information about yourself and your Accounts. You must provide accurate, current and complete information.
	"""
	Then A user should see "Header1Body19" with text
	"""
4 Adding Accounts to Nationwide Money
	"""
	Then A user should see "Header1Body20" with text
	"""
4.1 Nationwide Money allows you to add accounts you hold in your name or in joint names with someone else. However, you may not be able to add some accounts for the following reasons:
	"""
	Then A user should see "Header1Body21" with text
	"""
(a) you will only be able to add UK-based accounts provided by a Provider who has signed up to the Open Banking directory, and who has gone through our onboarding process; and
	"""
	Then A user should see "Header1Body22" with text
	"""
(b) Providers may limit the Accounts they allow access to through Open Banking.
	"""
	Then A user should see "Header1Body23" with text
	"""
4.2 Nationwide Money may prompt you to "verify" yourself with your Provider. This may involve you being redirected to your Provider's online banking login page, to enter your login details. If this happens, Nationwide will not see, record or store any of the login details you enter.
	"""
	Then A user should see "Header1Body24" with text
	"""
4.3 Please note that if you are prompted to "verify" yourself with your Provider, this is the same as you logging into your Provider's online banking service. This means that if you enter incorrect login details you may lock yourself out of your Provider's online banking service.
	"""
	Then A user should see "Header1Body25" with text
	"""
5 Our right to access Accounts
	"""
	Then A user should see "Header1Body26" with text
	"""
5.1 By adding an Account to Nationwide Money, you are giving your consent for us to access that Account in order to provide the Services. We will access your Accounts through dedicated interfaces made available to us in Open Banking by your Providers.
	"""
	Then A user should see "Header1Body27" with text
	"""
5.2 Once you have added an Account to Nationwide Money then we can access that Account for a limited period in order to provide you with Account Information. Once this period expires, your consent to us accessing the Account will lapse and we will prompt you for consent again. This may involve you "verifying" yourself with your Provider again.
	"""
	Then A user should see "Header1Body28" with text
	"""
5.3 Each time you ask us to initiate a payment, we will ask you for consent at that time. This may involve you "verifying" yourself with your Provider.
	"""
	Then A user should see "Header1Body29" with text
	"""
5.4 The same processes will apply if you use Nationwide Money in connection with a Nationwide Account. If you use Nationwide's mobile banking or online banking services to access your Nationwide Accounts instead, the terms and conditions for those services will apply and not these Terms.
	"""
	Then A user should see "Header1Body30" with text
	"""
5.5 We will not be able to access an Account, or initiate a payment in relation to an Account, where your Provider has blocked either your or our access to that Account.
	"""
	Then A user should see "Header1Body31" with text
	"""
6 Withdrawing consent and removing Accounts from Nationwide Money
	"""
	Then A user should see "Header1Body32" with text
	"""
6.1 As explained in the previous Condition, your consent to us accessing your Accounts will lapse after a period of time has passed (you can check how long this period is in the Nationwide Money app). You can also withdraw your consent to us accessing an Account at any time, in one of the following ways:
	"""
	Then A user should see "Header1Body33" with text
	"""
	(a) by removing an Account within the Nationwide Money app; or
	"""
	Then A user should see "Header1Body34" with text
	"""
	(b) by contacting your Provider.
	"""
	Then A user should see "Header1Body35" with text
	"""
6.2 Where you have withdrawn your consent, or your consent lapses and you do not renew it, we will no longer access new information about the Account. We will delete the Account history from Nationwide Money, but we will keep certain information and records in order to comply with our legal and regulatory obligations, or to enable us to respond to any queries or complaints you may have. We will retain and process these records in accordance with our legal and regulatory obligations and our Privacy Policy, a copy of which is available on our website.
	"""
	Then A user should see "Header1Body36" with text
	"""
7 Support for Nationwide Money
	"""
	Then A user should see "Header1Body37" with text
	"""
7.1 Updates for Nationwide Money will be periodically available in participating app stores. You should regularly check for updates and download these.
	"""
	Then A user should see "Header1Body38" with text
	"""
7.2 We may stop supporting Nationwide Money on your device or on the version of the operating system running on your device. When this happens, you will no longer be able to use Nationwide Money until you have updated the operating system on that device, or you use an alternative device that is supported, as applicable.
	"""
	Then A user should see "Header1Body39" with text
	"""
7.3 Nationwide Money is dependent on other third parties, including Providers. We will try to ensure that Nationwide Money is available to you at all times, although we cannot promise that Nationwide Money and the Services will always be available.
	"""
	Then A user should see "Header1Body40" with text
	"""
7.4 We may have to suspend access to Nationwide Money or the Services if we need to implement system changes, make upgrades or deal with technical or security problems.
	"""
	Then A user should see "Header1Body41" with text
	"""
	8 Security
	"""
	Then A user should see "Header1Body42" with text
	"""
	8.1 You must take reasonable steps to ensure that the information either shown or stored on your device is kept secure and confidential to you. In particular, you should keep your User Details safe. You should also log out of Nationwide Money at the end of the session. You will be automatically logged out of Nationwide Money after a period of inactivity.
	"""
	Then A user should see "Header1Body43" with text
	"""
	8.2 If you use the chat function in Nationwide Money, you should not disclose any security information such as your card details, personal account number or any login details.
	"""
	Then A user should see "Header1Body44" with text
	"""
	8.3 We may block your access if you incorrectly enter your User Details a number of times in a row. You will be able to log back in by following the instructions in Nationwide Money.
	"""
	Then A user should see "Header1Body45" with text
	"""
8.4 We may send you alerts from time to time. You can change the settings in Nationwide Money if you do not want to receive alerts. If you share your device with someone else, that person may see any alerts we send even if they cannot log into Nationwide Money.
	"""
	Then A user should see "Header1Body46" with text
	"""
	8.5 You must tell us as soon as you can (by sending an e-mail to artisupport@nationwide.co.uk) if you know or think somebody else knows your User Details.
	"""
	Then A user should see "Header1Body47" with text
	"""
	8.6 As soon as you tell us you know or think somebody else knows your User Details, we will deactivate those User Details. You will be able to set up new User Details using the Nationwide Money app. You must also inform your Providers if you believe the security of any of your Accounts could have been compromised.
	"""
	Then A user should see "Header1Body48" with text
	"""
	8.7 We may deactivate your User Details and/or suspend, withdraw or restrict your use of Nationwide Money if we think it is reasonably necessary because:
	"""
	Then A user should see "Header1Body49" with text
	"""
	(a) we suspect that Nationwide Money has been used or accessed in an unauthorised or fraudulent way, or has been used to facilitate fraud;
	"""
	Then A user should see "Header1Body50" with text
	"""
	(b) if we are obliged to do so by legal or regulatory requirements; or
	"""
	Then A user should see "Header1Body51" with text
	"""
	(c) you are (or we reasonably believe you are) in serious breach of these Terms, or you have repeatedly breached these Terms.
	"""
	Then A user should see "Header1Body52" with text
	"""
	If we do this, we will try to contact you by e-mail to let you know.
	"""
	Then A user should see "Header1Body53" with text
	"""
	9 Charges
	"""
	Then A user should see "Header1Body54" with text
	"""
	9.1 While there is currently no charge for using Nationwide Money, we reserve the right to change these Terms in order to introduce a charge for using Nationwide Money. Please see "Changes to these Terms" below for more information about when we might introduce a charge, and your right to end your agreement with us if we do so.
	"""
	Then A user should see "Header1Body55" with text
	"""
	9.2 Your network operator may charge you for data you consume when downloading and/or using Nationwide Money. These charges may vary between operators and whether you are abroad when accessing Nationwide Money.
	"""
	Then A user should see "Header1Body56" with text
	"""
	10 Our responsibility to you
	"""
	Then A user should see "Header1Body57" with text
	"""
	10.1 Nationwide Money has not been developed to meet your individual circumstances. It is your responsibility to consider whether Nationwide Money meets your needs.
	"""
	Then A user should see "Header1Body58" with text
	"""
	10.2 Nationwide Money is for personal use only. If you use Nationwide Money for any commercial or business purpose we will have no responsibility to you for any losses you suffer, including but not limited to loss of profit or loss of business.
	"""
	Then A user should see "Header1Body59" with text
	"""
	10.3 Nationwide Money is a tool which may help you manage your finances. It does not provide financial planning services or tax or financial advice. If you need advice of this nature, please speak to an authorised adviser.
	"""
	Then A user should see "Header1Body60" with text
	"""
	10.4 The Account Information and insights we provide in Nationwide Money are limited by the information we are able to obtain. This is explained in more detail in Part 2 of these Terms, under "Accuracy of the Account Information displayed in Nationwide Money".
	"""
	Then A user should see "Header1Body61" with text
	"""
	10.5 You will be responsible for any losses arising where you have deliberately or with gross negligence failed to keep your User Details safe, up to the point where you inform us that someone else has accessed your Nationwide Money user account without your authorisation. "Gross negligence" means that something you have done or have not done is very obviously wrong or careless.
	"""
	Then A user should see "Header1Body62" with text
	"""
	10.6 If you decide to use Nationwide Money when you are outside the UK, you will be responsible for checking that the local laws permit you to do this.
	"""
	Then A user should see "Header1Body63" with text
	"""
	10.7 We will not be responsible to you for any failure to provide any Service due to scheduled or required downtime, or for any reason that is beyond our reasonable control. Examples of this include (but are not limited to):
	"""
	Then A user should see "Header1Body64" with text
	"""
	(a) any technical failure of the Provider's online platform;
	"""
	Then A user should see "Header1Body65" with text
	"""
	(b) a Provider blocking our access to your Account Information;
	"""
	Then A user should see "Header1Body66" with text
	"""
	(c) failure of any machine, data processing system or transmission link; or
	"""
	Then A user should see "Header1Body67" with text
	"""
	(d) outages or lack of coverage or signal on any phone network.
	"""
	Then A user should see "Header1Body68" with text
	"""
	10.8 We will not be responsible to you for any losses which would not have been reasonably foreseeable by us at the relevant time.
	"""
	Then A user should see "Header1Body69" with text
	"""
	10.9 Where you believe someone has accessed an Account without your authorisation, or that a payment has been made incorrectly, late or has not been made at all, you should contact your Provider directly and not us. This is the case even if the instruction which forms the basis of your query or complaint was initiated by us as part of the Services. For more information on complaints, please see Condition 14 below.
	"""
	Then A user should see "Header1Body70" with text
	"""
	11 Ending your use of Nationwide Money
	"""
	Then A user should see "Header1Body71" with text
	"""
	11.1 You can cancel or end your agreement with us at any time by simply deleting your user account. If you prefer, you can also cancel or end your agreement with us by sending an email to artisupport@nationwide.co.uk.
	"""
	Then A user should see "Header1Body72" with text
	"""
	11.2 We may end your use of Nationwide Money at any time. We will usually inform you a month in advance of doing so, but we can end your use of Nationwide Money without notice in exceptional circumstances. These might include where:
	"""
	Then A user should see "Header1Body73" with text
	"""
	(a) we are legally obliged to do so;
	"""
	Then A user should see "Header1Body74" with text
	"""
	(b) you have carried out (or we reasonably suspect you have carried out) illegal or fraudulent activity using Nationwide Money;
	"""
	Then A user should see "Header1Body75" with text
	"""
	(c) you have committed a serious breach of these Terms or have repeatedly breached these Terms;
	"""
	Then A user should see "Header1Body76" with text
	"""
	(d) you have been threatening or abusive towards our staff or third party suppliers;
	"""
	Then A user should see "Header1Body77" with text
	"""
	(e) you have not provided us with information we have requested about your identity;
	"""
	Then A user should see "Header1Body78" with text
	"""
	(f) we reasonably consider that by continuing with these Terms we may break any law, regulation, code or other duty that applies to us or which we have agreed to follow;
	"""
	Then A user should see "Header1Body79" with text
	"""
	(g) we reasonably consider that we may be exposed to action from any government, regulator or law enforcement agency.
	"""
	Then A user should see "Header1Body80" with text
	"""
	11.3 It is your responsibility to delete Nationwide Money from your device if you change or dispose of that device. Deleting the Nationwide Money app from a device will not result in your user account being deleted.
	"""
	Then A user should see "Header1Body81" with text
	"""
	11.4 Where you cancel or end your agreement with us (including where you delete your user account), or we end your use of Nationwide Money, we will delete the Account history from Nationwide Money and we will no longer access new information about the Account. However, we will keep records as explained in our Privacy Policy, a copy of which is available on our website.
	"""
	Then A user should see "Header1Body82" with text
	"""
	12 Changes to Nationwide Money, the Services and/or these Terms
	"""
	Then A user should see "Header1Body83" with text
	"""
	12.1 We may make changes to Nationwide Money and/or the Services, and/or vary these Terms. Changes may include the addition or removal of features or Services.
	"""
	Then A user should see "Header1Body84" with text
	"""
	12.2 Any change we make to Nationwide Money, the Services and/or the Terms will be proportionate to the reason for that change. In particular, we recognise that if we are introducing a new charge, this is likely to have a greater impact on you than other changes and so we will only do this when we believe that doing so is a balanced response to the changing circumstances.
	"""
	Then A user should see "Header1Body85" with text
	"""
	12.3 We may change the layout, configuration or content of Nationwide Money, introduce new features, withdraw features, change the way that Services are provided and/or introduce new Services at any time. We can do this without giving you prior notice, provided these changes:
	"""
	Then A user should see "Header1Body86" with text
	"""
	(a) do not have a serious adverse effect on the existing Services we provide to you at the time of the change; and
	"""
	Then A user should see "Header1Body87" with text
	"""
	(b) do not change your legal rights under these Terms.
	"""
	Then A user should see "Header1Body88" with text
	"""
	12.4 Except as explained above, we will normally give you 30 calendar days' notice before any change to these Terms, or any withdrawal of any Services, takes effect unless it is not practical or possible to do so, in which case we will tell you as soon as we can after the change takes effect. We will notify you of the change using Nationwide Money, although we may send you personal notice if we consider it appropriate to do so. The new Terms and/or details of the amended Services may be displayed on screen and you may be asked to read and accept them the next time you log in. Since we will normally notify you of changes to the Terms and/or Services in Nationwide Money itself, we recommend that you log on at least every 14 calendar days.
	"""
	Then A user should see "Header1Body89" with text
	"""
	12.5 If you are not happy with a change we tell you about in advance, and you decide you would like to end the service, you can do so by cancelling Nationwide Money as explained in Condition 11.1. If we do not hear from you within 30 calendar days (or within two months, if we have notified you of a new charge or a change to a charge) of us telling you about the change, we will take this to mean that you have accepted the change.
	"""
	Then A user should see "Header1Body90" with text
	"""
	12.6 We can make changes to the Terms and/or to Services for one or more of the following reasons:
	"""
	Then A user should see "Header1Body91" with text
	"""
	(a) to introduce new functionality, services or benefits, to improve the way in which Nationwide Money and the Services are provided, or to withdraw functionality;
	"""
	Then A user should see "Header1Body92" with text
	"""
	(b) to run our business in a profitable and fair way that balances the needs of our members with the need to remain competitive and maintain our financial strength;
	"""
	Then A user should see "Header1Body93" with text
	"""
	(c) to ensure our terms and conditions are consistent with products we offer or that the banking industry or our competitors offer;
	"""
	Then A user should see "Header1Body94" with text
	"""
	(d) due to changes in the costs we incur in running our business or those we incur in providing our existing or new services to you. Examples of these costs might include administrative costs, employment costs, building costs and technology costs. This will also include where the costs of a service or benefit provided by us or by anyone else changes;
	"""
	Then A user should see "Header1Body95" with text
	"""
	(e) as a result of developments in technology or security, or changes in the way we want to provide services, or to reflect changes in the way the banking industry delivers services;
	"""
	Then A user should see "Header1Body96" with text
	"""
	(f) because of changes in our ownership or a re-organisation due to us merging with or acquiring another business;
	"""
	Then A user should see "Header1Body97" with text
	"""
	(g) to meet relevant legal or regulatory requirements;
	"""
	Then A user should see "Header1Body98" with text
	"""
	(h) to respond to changes, or reasonably anticipated changes, in the law, regulations, codes of practice or industry standards which apply to us or which we have agreed to follow, or because of a decision of a court, ombudsman or regulator; or
	"""
	Then A user should see "Header1Body99" with text
	"""
	(i) to make the Terms clearer or fairer.
	"""
	Then A user should see "Header1Body100" with text
	"""
	13 Licence restrictions
	"""
	Then A user should see "Header1Body101" with text
	"""
	13.1 All intellectual property rights in Nationwide Money belong to us and/or our licensors. You have no intellectual property rights in, or to, Nationwide Money other than the right to use Nationwide Money in accordance with these Terms and you will not be entitled to grant any rights to any third party in relation to Nationwide Money.
	"""
	Then A user should see "Header1Body102" with text
	"""
	13.2 You must only download Nationwide Money from an official app store in which we make Nationwide Money available.
	"""
	Then A user should see "Header1Body103" with text
	"""
	13.3 You must not use Nationwide Money in any unlawful or malicious manner or in any manner inconsistent with these Terms.
	"""
	Then A user should see "Header1Body104" with text
	"""
	14 Complaints and queries
	"""
	Then A user should see "Header1Body105" with text
	"""
	14.1 We hope that we always live up to your expectations. If we do not, we want to know so that we can put things right and improve the service we provide to our users. If you are not satisfied with the Services that we have provided (as opposed to the services your Provider has provided), you can contact us by sending an e-mail to artisupport@nationwide.co.uk. We will provide a full response to your complaint or response by post or by email or any other format we agree with you. We will try and do this within 3 Working Days if possible.
	"""
	Then A user should see "Header1Body106" with text
	"""
	14.2 There may be some situations where we believe it is the responsibility of the Provider to deal with your query or complaint, in which case we will ask you to contact your Provider directly. We will not negotiate and agree claims against your Provider on your behalf.
	"""
	Then A user should see "Header1Body107" with text
	"""
	14.3 If you are not satisfied with the way we have dealt with your complaint you can refer it to the Financial Ombudsman Service within 6 months of receiving our final response. You can also refer your complaint to them first without giving us the opportunity to resolve it, but if you do this, they will only consider your complaint with our consent. The Financial Ombudsman Service provides a free, independent, complaint resolution service. Details about their service and how to refer a complaint to them can be found on their website at www.financial-ombudsman.org.uk. You can also refer your complaint to the Financial Ombudsman Service using the Online Dispute Resolution platform. The platform has been established by the European Commission to provide an online tool for consumers to resolve disputes about goods and services purchased online. The platform can be found at www.ec.europa.eu/consumers/odr.
	"""
	Then A user should see "Header1Body108" with text
	"""
	14.4 You also have a right to complain to the Financial Conduct Authority. The Financial Conduct Authority's details can be found on its website: www.fca.org.uk/contact.
	"""
	Then A user should see "Header1Body109" with text
	"""
	15 How we will contact you
	"""
	Then A user should see "Header1Body110" with text
	"""
	15.1 We will normally contact you using notifications within Nationwide Money. We will do this to keep you informed of matters relevant to Nationwide Money or where we need to in order to comply with our legal obligations. We may alternatively contact you using the email address which you use to create your User Details.
	"""
	Then A user should see "Header1Body111" with text
	"""
	15.2 These Terms and any communications we send to you will be in English.
	"""
	Then A user should see "Header1Body112" with text
	"""
	15.3 Please remember to tell us if your details change. If we discover or suspect fraud or a security threat, we may need to contact you.
	"""
	Then A user should see "Header1Body113" with text
	"""
	16 How to contact us
	"""
	Then A user should see "Header1Body114" with text
	"""
	16.1 You can contact us by sending an e-mail to artisupport@nationwide.co.uk.
	"""
	Then A user should see "Header1Body115" with text
	"""
	17 Miscellaneous
	"""
	Then A user should see "Header1Body116" with text
	"""
	17.1 If we fail to insist that you perform any of your obligations, or if we do not enforce our rights against you, or if we delay in doing so, that will not mean that we have waived our rights against you and will not mean that you do not have to comply with those obligations.
	"""
	Then A user should see "Header1Body117" with text
	"""
	17.2 Each of the conditions of these Terms operates separately. If any court decides that any of them are unenforceable, the remaining conditions will remain in full force and effect.
	"""
	Then A user should see "Header1Body118" with text
	"""
	18 Law
	"""
	Then A user should see "Header1Body119" with text
	"""
	18.1 These Terms, and any discussions we have had with you about entering into them, are governed by English law. If you want to bring a claim against us in the courts, the courts of England and Wales will be able to deal with any questions relating to these Terms but if you live in another country, you can bring a claim in the courts which are local to you.
	"""
	Then A user should see "Header2" with text
	"""
	PART 2: ACCOUNT INFORMATION SERVICES
	"""
	Then A user should see "Header2Body1" with text
	"""
	1 Description of the Services
	"""
	Then A user should see "Header2Body2" with text
	"""
	1.1 Nationwide Money enables you, amongst other things, to:
	"""
	Then A user should see "Header2Body3" with text
	"""
	(a) see account information from your online bank and building society Accounts in one place;
	"""
	Then A user should see "Header2Body4" with text
	"""
	(b) see what you have spent and where; and
	"""
	Then A user should see "Header2Body5" with text
	"""
	(c) receive insights that could make how you spend your money easier to understand and help you save more.
	"""
	Then A user should see "Header2Body6" with text
	"""
	2 Accuracy of the Account Information displayed in Nationwide Money
	"""
	Then A user should see "Header2Body7" with text
	"""
	2.1 Provided we have your consent to do so and that consent has not lapsed, we will access your Account Information periodically during each day.
	"""
	Then A user should see "Header2Body8" with text
	"""
	2.2 The Account Information we display in Nationwide Money is dependent on the information we receive from the Provider, and the Accounts we are able to access. We will have no responsibility where the Provider gives us incomplete or incorrect information.
	"""
	Then A user should see "Header2Body9" with text
	"""
	2.3 The Account Information we display in Nationwide Money is time-stamped and may not reflect the current balance of your Accounts at the time you view that information. For example, it may not take account of recent credits to and/or withdrawals from your Accounts. If it is important for you to check the current balance of your Account at any specific time, you should contact your Provider directly for this information.
	"""
	Then A user should see "Header2Body10" with text
	"""
	2.4 Any insight we provide will be based only on the information we have been able to obtain from your Providers. It does not represent a comprehensive illustration of your financial situation. For example, it may not take into account balances held in a savings account, or credit card, personal loan or mortgage balances.
	"""
	Then A user should see "Header2Body11" with text
	"""
	2.5 Where we examine your spending habits, we will look at your transaction activity over a period of time. Where we are unable to obtain much information about your transaction activity – for example, because your Account was opened only recently – the assumptions we make about your spending habits will be less accurate.
	"""
	Then A user should see "Header2Body12" with text
	"""
	2.6 For these reasons, you should not make any financial decisions based solely on the information we display in Nationwide Money. If you do so, or if you share this information with someone else, we will not be responsible for any losses you or they suffer as a result.
	"""
	Then A user should see "Header3" with text
	"""
	PART 3: PAYMENT INITIATION SERVICES
	"""
	Then A user should see "Header3Body1" with text
	"""
	1 Description of the Services
	"""
	Then A user should see "Header3Body2" with text
	"""
	1.1 Nationwide Money enables you to give us instructions to "initiate" a payment from one of your Accounts, rather than you logging into your Provider's online banking service and initiating the payment yourself. We will communicate the instruction to your Provider on your behalf.
	"""
	Then A user should see "Header3Body3" with text
	"""
	1.2 It is important that you enter the details of the payment you wish to make correctly, because this is the information we will pass on to your Provider when we initiate the payment. If you provide incorrect information, this could result in the payment being refused or delayed by the Provider, or the payment could be made to the wrong account. We will not be responsible for any loss you suffer as a result.
	"""
	Then A user should see "Header3Body4" with text
	"""
	1.3 To meet legal and regulatory requirements, we may carry out checks before initiating a payment on your behalf, with a view to preventing financial crime. Occasionally this may lead to a delay in us initiating a payment. In some circumstances we may not be able to initiate the payment. We will always tell you if this is the case unless it would be unlawful for us to do so. We will not be responsible for any loss that results from this.
	"""
	Then A user should see "Header3Body5" with text
	"""
	1.4 We may refuse to initiate a payment instruction (and we will not be responsible for any loss to you) if:
	"""
	Then A user should see "Header3Body6" with text
	"""
	(a) you have not met all of the conditions for initiating a payment under these Terms;
	"""
	Then A user should see "Header3Body7" with text
	"""
	(b) your instruction to us is not clear or does not contain the information we need;
	"""
	Then A user should see "Header3Body8" with text
	"""
	(c) our security controls mean you must produce additional identification, or prevent us from initiating the payment;
	"""
	Then A user should see "Header3Body9" with text
	"""
	(d) we reasonably suspect fraud or illegal activity;
	"""
	Then A user should see "Header3Body10" with text
	"""
	(e) we reasonably suspect misuse of Nationwide Money, either by you or by someone else;
	"""
	Then A user should see "Header3Body11" with text
	"""
	(f) we reasonably consider that there is a security or fraud risk relating to Nationwide Money;
	"""
	Then A user should see "Header3Body12" with text
	"""
	(g) we are ordered to do so by a court; or
	"""
	Then A user should see "Header3Body13" with text
	"""
	(h) we might breach a law, regulation, code or other duty that applies to us or which we have agreed to follow.
	"""
	Then A user should see "Header3Body14" with text
	"""
	1.5 If we do not initiate a payment you have requested, we normally inform you through Nationwide Money.
	"""
	Then A user should see "Header3Body15" with text
	"""
	1.6 Information about the refusal and, if possible, our reasons for the refusal and information on how to correct any factual errors that led to the refusal, can be obtained from us from the end of the next Working Day by sending an e-mail to artisupport@nationwide.co.uk.
	"""
	Then A user should see "Header3Body16" with text
	"""
	2 Confirming initiation of a payment instruction
	"""
	Then A user should see "Header3Body17" with text
	"""
	2.1 Once you have completed and confirmed the details of your payment instruction to us, we will send your payment instruction to your Provider. We will then make the following information available to you through Nationwide Money:
	"""
	Then A user should see "Header3Body18" with text
	"""
	(a) we will confirm that the instruction has been sent to your Provider successfully;
	"""
	Then A user should see "Header3Body19" with text
	"""
	(b) we will give you information which will allow you and the payee to identify the payment transaction, and which will allow the payee (where relevant) to identify you, and any information transferred with the instruction;
	"""
	Then A user should see "Header3Body20" with text
	"""
	(c) we will confirm the amount of the payment transaction; and
	"""
	Then A user should see "Header3Body21" with text
	"""
	(d) we will (if relevant) tell you our charges for initiating the payment instruction, and give you a breakdown of those charges where appropriate.
	"""
	Then A user should see "Header3Body22" with text
	"""
	3 Important points to bear in mind
	"""
	Then A user should see "Header3Body23" with text
	"""
	3.1 Your Provider will decide which payments can be initiated by us using Open Banking. As a result, we may not be able to initiate certain types of payments.
	"""
	Then A user should see "Header3Body24" with text
	"""
	3.2 All payment instructions that we send to your Provider will be subject to the Provider's terms and conditions for your Account.
	"""
	Then A user should see "Header3Body25" with text
	"""
	3.3 Once you have told us to initiate a payment on your behalf, we will pass this to your Provider. After we have done so, you cannot cancel your instruction to us. You may be able to cancel the payment instruction by contacting your Provider directly.
	"""
	Then A user should see "Header3Body26" with text
	"""
	3.4 The Service we provide is a payment initiation service, which means that we give your Provider a payment instruction on your behalf. When we confirm that the payment has been successfully initiated, this does not mean that the Provider has accepted the instruction, or that the payment has been made. The Provider should make this information available to you separately, for example through online banking. If we successfully initiate a payment but your Provider refuses to process the payment instruction, the Provider may make information available to you about why it has done so.
	"""
	Then A user should see "Header3Body27" with text
	"""
	3.5 The Provider's cut-off times for accepting payment instructions, and the time it takes to process a payment and send it to the payee's bank, should be explained in the Provider's terms and conditions for your Account.
	"""
	Then A user should see "Header3Body28" with text
	"""
	3.6 We will not be responsible where the Provider fails to process a payment instruction that we have sent, or where the Provider processes it incorrectly or late.
	"""
	Then A user should see "Header3Body29" with text
	"""
	3.7 If your Provider contacts us regarding an alleged unauthorised payment and we suspect that you acted fraudulently, or that you deliberately or with gross negligence failed to keep your User Details and Account security credentials safe, we can share what we know about the circumstances with your Provider.
	"""
	Then A user should see "Header3Body30" with text
	"""
	3.8 You cannot use this Service to send non-payment instructions to your Provider, for example an instruction to close an account. Also, you cannot use this Service to tell your Provider about any unauthorised access to your Account, or to make a complaint to your Provider. You must contact your Provider directly in these circumstances.
	"""







