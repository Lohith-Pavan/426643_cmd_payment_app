CREATE DATABASE cmd_payment_app;
USE cmd_payment_app;

CREATE TABLE user_details (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone_number VARCHAR(10) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE user_account_details (
    user_account_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    account_open_date DATE,
    current_wallet_balance DECIMAL(10,2) DEFAULT 0.00,
    linked_bank_accounts_count INT DEFAULT 0,
    wallet_pin VARCHAR(6) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user_details(user_id) ON DELETE CASCADE
);

CREATE TABLE bank_accounts (
    bank_account_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    account_number VARCHAR(5) UNIQUE NOT NULL, 
    ifsc_code VARCHAR(5) NOT NULL,            
    bank_name VARCHAR(50) NOT NULL,
    bank_branch VARCHAR(50) NOT NULL,          
    bank_location VARCHAR(50) NOT NULL,        
    is_active VARCHAR(3) DEFAULT 'Yes',        
    FOREIGN KEY (user_id) REFERENCES user_details(user_id) ON DELETE CASCADE
);

CREATE TABLE source_types (
    source_id INT PRIMARY KEY AUTO_INCREMENT,
    source_type_code VARCHAR(10) UNIQUE NOT NULL,
    source_type_name VARCHAR(50) NOT NULL
);

CREATE TABLE txn_details (
    txn_id INT PRIMARY KEY AUTO_INCREMENT,
    txn_date_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    source_id INT NOT NULL,
    target_id INT,
    source_type_code VARCHAR(10) NOT NULL,
    dest_type_code VARCHAR(10) NOT NULL,
    txn_amount DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (source_type_code) REFERENCES source_types(source_type_code),
    FOREIGN KEY (dest_type_code) REFERENCES source_types(source_type_code)
);

INSERT INTO user_details (user_name, password, first_name, last_name, phone_number, email, address) VALUES
('venkat123', 'pass@123', 'Venkat', 'Reddy', '98765', 'venkat@123', 'Hyderabad, Telangana'),
('sneha45', 'sneh@456', 'Sneha', 'Kumar', '81234', 'sneha@456', 'Chennai, Tamil Nadu'),
('arjun90', 'arjun@789', 'Arjun', 'Varma', '92345', 'arjun@789', 'Vizag, Andhra Pradesh');

INSERT INTO user_account_details (user_id, account_open_date, current_wallet_balance, linked_bank_accounts_count, wallet_pin) VALUES
(1, '2022-05-15', 5000.00, 2, '123456'),  
(2, '2023-03-10', 12000.50, 1, '654321'), 
(3, '2021-11-25', 3500.75, 1, '789012');  

INSERT INTO bank_accounts (user_id, account_number, ifsc_code, bank_name, bank_branch, bank_location, is_active) VALUES
(1, '12345', 'SBI43', 'SBI', 'Madhapur', 'Hyderabad', 'Yes'),
(1, '23456', 'ICIC2', 'ICICI', 'Kukatpally', 'Hyderabad', 'No'),
(2, '34567', 'HDFC1', 'HDFC', 'Ram Nagar', 'Chennai', 'Yes'),
(3, '45678', 'AXIS8', 'Axis', 'Dwaraka Nagar', 'Vizag', 'Yes');

INSERT INTO source_types (source_type_code, source_type_name) VALUES
('BA', 'Bank Account'),
('WA', 'Wallet Account'),
('TPT', 'Mobile Recharge');

INSERT INTO txn_details (source_id, target_id, source_type_code, dest_type_code, txn_amount) VALUES
(1, 1, 'BA', 'BA', 2500.00),   -- Bank to Bank Transfer
(2, 1, 'WA', 'BA', 500.00),    -- Wallet to Bank Transfer
(1, 3, 'BA', 'TPT', 199.00),   -- Bank to Mobile Recharge
(2, 2, 'WA', 'WA', 1500.75),   -- Wallet to Wallet Transfer
(1, 3, 'BA', 'TPT', 650.00);   -- Bank to Bill Payment
-- get all user details
SELECT * FROM user_details;
-- get active bank accounts
SELECT * FROM bank_accounts WHERE is_active = 'Yes';
-- get txn details of a specific user
SELECT * FROM txn_details WHERE source_id = 1 OR target_id = 1;
-- find users with bank account in hyderabad
SELECT u.first_name, u.last_name, b.bank_name, b.bank_branch 
FROM user_details u
JOIN bank_accounts b ON u.user_id = b.user_id
WHERE b.bank_location = 'Hyderabad';
-- find txns made using a bank account
SELECT * FROM txn_details WHERE source_type_code = 'BA';
-- get count of txns for source type
SELECT source_type_code, COUNT(*) AS transaction_count 
FROM txn_details 
GROUP BY source_type_code;
-- find the highest txn ammount
SELECT * FROM txn_details ORDER BY txn_amount DESC LIMIT 1;
--  list users who have linked more than 1 bank account
SELECT user_id,linked_bank_accounts_count FROM user_account_details WHERE linked_bank_accounts_count > 1;
-- find users who have done mobile recharges
SELECT u.first_name, u.last_name, t.txn_amount 
FROM txn_details t
JOIN user_details u ON t.source_id = u.user_id
WHERE t.dest_type_code = 'TPT';
















