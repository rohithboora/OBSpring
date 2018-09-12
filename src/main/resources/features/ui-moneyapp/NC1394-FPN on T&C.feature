@ui @regression
Feature: UI-NC1394-T&C Fair Processing Notice

  Scenario: User checks for FPN details in terms and condition page
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "Firstname" in "your first name" field on the "register" page
    And A user enters "Surname" in "Your surname" field on the "register" page
    And A user enters "testing@321.com" in "your email address" field on the "register" page
    And A user enters "Password@1a" in "Set password" field on the "register" page
    And A user enters "Password@1a" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "FpnLink" button on the "tandc" page
    And A user is redirected to the "FPN" page
    And A user should see "Title" with text
    	"""
		How we use your information
		"""
    And A user should see "Body1" with text
	"""
	The information you provide to us (including information we collect about your device), together with the information you authorise us to collect/consent to us collecting from your bank or building society will be held by Nationwide. We will use this information to (1) register you for our pilot, (2) manage and administer your relationship with us, including categorising your transactions to provide you with insight to your spending and proposed budget, (3) monitor, test, improve and provide enhancements to the service, and (4) meet any legal or regulatory requirements
	"""
    And A user should see "Body2" with text
	"""
	We will only use your information where we have a legal basis to do so in accordance with data protection laws, for example, to carry out our legitimate business interests to provide and manage Nationwide Money or to meet our legal or contractual obligations. Information will only be collected from your bank or building society in line with your authority. Your information will be retained for up to six years after the pilot completes. Transaction data will be deleted upon you terminating the service, although some data will be retained in accordance with our data retention policy.
	"""
    And A user should see "Body3" with text
	"""
	When necessary, your information may be shared within Nationwide, with suppliers who support the operation of our business and where the law permits or requires us to do so.
	"""
    And A user should see "Body4" with text
	"""
	Please note, we do not ask you to provide special category data. However, it is possible that your account and transaction data may reveal this data, which is subject to special protection under data privacy legislation. No analysis or other use of the following characteristics will be made by Nationwide if they are revealed by the transaction data obtained as part of the service: racial or ethnic origin, political opinions, religious or philosophical beliefs, criminal convictions and offences, trade union membership, genetic data, biometric data, health, sex life or sexual orientation. If you do not want Nationwide to process this data, you should not connect your accounts.
	"""
    Then A user should see "Body5" with text
	"""
	To find out more about how we may use cookies and similar technology on Nationwide's websites and digital services. Please see our
	"""


  Scenario: User checks for FPN details in terms and condition page and clicks continue
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "Firstname" in "your first name" field on the "register" page
    And A user enters "Surname" in "Your surname" field on the "register" page
    And A user enters "testing@321.com" in "your email address" field on the "register" page
    And A user enters "Password@1a" in "Set password" field on the "register" page
    And A user enters "Password@1a" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "FpnLink" button on the "tandc" page
    And A user is redirected to the "FPN" page
    And A user should see "Title" with text
    	"""
		How we use your information
		"""
    And A user should see "Body1" with text
	"""
	The information you provide to us (including information we collect about your device), together with the information you authorise us to collect/consent to us collecting from your bank or building society will be held by Nationwide. We will use this information to (1) register you for our pilot, (2) manage and administer your relationship with us, including categorising your transactions to provide you with insight to your spending and proposed budget, (3) monitor, test, improve and provide enhancements to the service, and (4) meet any legal or regulatory requirements
	"""
    And A user should see "Body2" with text
	"""
	We will only use your information where we have a legal basis to do so in accordance with data protection laws, for example, to carry out our legitimate business interests to provide and manage Nationwide Money or to meet our legal or contractual obligations. Information will only be collected from your bank or building society in line with your authority. Your information will be retained for up to six years after the pilot completes. Transaction data will be deleted upon you terminating the service, although some data will be retained in accordance with our data retention policy.
	"""
    And A user should see "Body3" with text
	"""
	When necessary, your information may be shared within Nationwide, with suppliers who support the operation of our business and where the law permits or requires us to do so.
	"""
    And A user should see "Body4" with text
	"""
	Please note, we do not ask you to provide special category data. However, it is possible that your account and transaction data may reveal this data, which is subject to special protection under data privacy legislation. No analysis or other use of the following characteristics will be made by Nationwide if they are revealed by the transaction data obtained as part of the service: racial or ethnic origin, political opinions, religious or philosophical beliefs, criminal convictions and offences, trade union membership, genetic data, biometric data, health, sex life or sexual orientation. If you do not want Nationwide to process this data, you should not connect your accounts.
	"""
    And A user should see "Body5" with text
	"""
	To find out more about how we may use cookies and similar technology on Nationwide's websites and digital services. Please see our
	"""
    And A user clicks the "Continue" button on the "FPN" page
    Then A user is redirected to the "tanc" page
	