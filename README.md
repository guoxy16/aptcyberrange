# Threat Instrumentation And Machine Automation Tool

## Table of contents

1. [Installation]
1. [Document information](https://github.com/abemelvin/tiamat#1-document-information-)   
1.1 [Version](https://github.com/abemelvin/tiamat#11-version-)   
1.2 [Contributors](https://github.com/abemelvin/tiamat#12-contributors-)   
1.3 [References](https://github.com/abemelvin/tiamat#13-references-)
2. [Purpose and scope](https://github.com/abemelvin/tiamat#2-purpose-and-scope-)   
2.1 [Justification](https://github.com/abemelvin/tiamat#21-justification-)   
2.2 [Deliverables](https://github.com/abemelvin/tiamat#22-deliverables-)   
2.3 [Exclusions](https://github.com/abemelvin/tiamat#23-exclusions-)   
2.4 [Assumptions](https://github.com/abemelvin/tiamat#24-assumptions-)   
3. [Stakeholders](https://github.com/abemelvin/tiamat#3-stakeholders-)   
3.1 [Researchers](https://github.com/abemelvin/tiamat#31-researchers-)   
3.2 [Maintainers](https://github.com/abemelvin/tiamat#32-maintainers-)   
3.3 [Developers](https://github.com/abemelvin/tiamat#33-developers-)
4. [Project](https://github.com/abemelvin/tiamat#4-project-)   
4.1 [Problem description](https://github.com/abemelvin/tiamat#41-problem-description-)   
4.2 [Solution overview](https://github.com/abemelvin/tiamat#42-solution-overview-)   
4.3 [Functional requirements](https://github.com/abemelvin/tiamat#43-functional-requirements-)   
4.4 [Quality attributes](https://github.com/abemelvin/tiamat#44-quality-attributes-)   
4.5 [Constraints](https://github.com/abemelvin/tiamat#45-constraints-)   
4.6 [Mock network](https://github.com/abemelvin/tiamat#46-mock-network-)   
4.7 [Instrumentation and data](https://github.com/abemelvin/tiamat#47-instrumentation-and-data-)   
4.8 [Dependencies](https://github.com/abemelvin/tiamat#48-dependencies-)
5. [Key views](https://github.com/abemelvin/tiamat#5-key-views-)   
5.1 [Mock network diagram](https://github.com/abemelvin/tiamat#51-mock-network-diagram-)

---

## 1. Installation [↑](https://github.com/abemelvin/tiamat)

Tiamat does not require compilation which makes installation extremely simple.
Just clone the Tiamat repository to your local machine by running
`git clone https://github.com/abemelvin/tiamat.git` in your shell.

## 2. Getting started [↑](https://github.com/abemelvin/tiamat)

To start using Tiamat, execute the `tiamat.py` script located in the
`tiamat/terraform/` directory by running `python tiamat.py`.

Tiamat utilizes Terraform (https://www.terraform.io) to instantiate the
infrastructure needed to host your testbed. Terraform accesses various
AWS APIs which require you to have a validated AWS account and to also
specify your AWS access keys in your environment. Tiamat will check that
your environment is correctly configured before allowing you to proceed
to deployment. Tiamat will also check that your PATH variable contains a 
valid Terraform executable, and will assist you in downloading an
executable if one is not found.

## 3. Deploying the testbed [↑](https://github.com/abemelvin/tiamat)

Tiamat maintains a list of servers that are currently flagged to be deployed.
You can view this list by running `show deployment list` in the Tiamat shell:

~~~
(Tiamat) show deployment list
- elk
- contractor
- blackhat
- mail
- ftp
~~~

To view a list of all the servers that you can add to the deployment list,
run `show available` in the Tiamat shell:

~~~
(Tiamat) show available
- blackhat
- contractor
- elk
- ftp
- mail
- payments
- wazuh
- web
~~~

To add servers to the deployment list, run `add server [name]` in the
Tiamat shell, replacing `[name]` with the specific server identifier:

~~~
(Tiamat) add server payments
~~~

To remove servers from the deployment list, run `remove server [name]` in the
Tiamat shell, replacing `[name]` with the specific server identifer:

~~~
(Tiamat) remove server payments
~~~

Once you are satisfied with your server list, you can proceed with deployment
by running `deploy` in the Tiamat shell:

~~~
(Tiamat) deploy
~~~

After initiating deployment, Tiamat will first check your deployment
template for errors. If an error is detected, this may indicate that the
`tiamat/terraform/configuration.tf` file is damaged. If you are confident
that this is not the case, you can proceed with deployment by following
the prompts.

Once deployment is complete, you will be presented with the public IP addresses
of your servers. If you wish to SSH directly into your servers or to access
a web service running on your servers, you will need this information:

~~~
Outputs:

ansible ip = 54.242.186.67
payments ip = 34.207.64.90
~~~

## 4. Provisioning the testbed

Once deployment is complete, you will need to provision the instantiated
servers with the appropriate software packages. Automated provisioning
scripts are provided for each available server, which can be executed using
Ansible. To connect to Ansible, run `ansible` in the Tiamat shell:

~~~
(Tiamat) ansible
~~~

Once you have a secure shell to Ansible, you can execute the provisioning
scripts that correspond to the servers you deployed. For example, if you
only chose to deploy the payments server, you would provision that server
like so:

~~~
ubuntu@ip-10-0-0-10:~$ ansible-playbook install/payment_server.yml
~~~

Once you have provisioned the testbed, you can interact with the environment
as you see fit.

## 5. Destroying the testbed

Since your testbed is deployed on AWS, you will be charged based on the
volume and length of your usage. Therefore, it is key to destroy the testbed
once you are done with your experiments. To do this, run `destroy`:

~~~
(Tiamat) destroy
~~~

Terraform will confirm your intent to destroy one final time before the process
is initiated. Try not to interrupt the destruction process once it has started,
as it could prevent Terraform from halting gracefully and damage your state
file in the process.

## 1 Document information [↑](https://github.com/abemelvin/tiamat)

---

### 1.1 Version [↑](https://github.com/abemelvin/tiamat)

---

### 1.2 Contributors [↑](https://github.com/abemelvin/tiamat)

---

### 1.3 References [↑](https://github.com/abemelvin/tiamat)

---

## 2 Purpose and scope [↑](https://github.com/abemelvin/tiamat)

---

### 2.1 Justification [↑](https://github.com/abemelvin/tiamat)

---

### 2.2 Deliverables [↑](https://github.com/abemelvin/tiamat)

* Mock network
* Range infrastructure
* Scenario injects
* Architecture documentation
* Researcher instructions
* Maintainer instructions

---

### 2.3 Exclusions [↑](https://github.com/abemelvin/tiamat)

---

### 2.4 Assumptions [↑](https://github.com/abemelvin/tiamat)

---

## 3 Stakeholders [↑](https://github.com/abemelvin/tiamat)

---

### 3.1 Researcher [↑](https://github.com/abemelvin/tiamat)

---

### 3.2 Maintainer [↑](https://github.com/abemelvin/tiamat)

---

### 3.3 Developer [↑](https://github.com/abemelvin/tiamat)

---

## 4 Project [↑](https://github.com/abemelvin/tiamat)

---

### 4.1 Problem description [↑](https://github.com/abemelvin/tiamat)

---

### 4.2 Solution overview [↑](https://github.com/abemelvin/tiamat)

---

### 4.3 Functional requirements [↑](https://github.com/abemelvin/tiamat)

#### Researcher Use Case

![researcher use case](https://github.com/abemelvin/tiamat/blob/master/researcher_use_case.png "researcher use case")

---

### 4.4 Quality attributes [↑](https://github.com/abemelvin/tiamat)

#### Modifiability

* **Source:** Researcher
* **Stimulus:** Deploy additional hosts to the mock network
* **Environment:** Pre-deployment or experiment run-time
* **Artifact:** Infrastructure configuration files
* **Response:** Deployed infrastructure continues uninterrupted, and newly
defined hosts are deployed in real time
* **Response measure:** Less than 30 minutes needed for each new host to
deploy, no downtime experienced for infrastructure already deployed beforehand

#### Portability

* **Source:** Researcher
* **Stimulus:** Transfer system from one machine to another
* **Environment:** Pre-deployment
* **Artifact:** System repository
* **Response:** System configurations are preserved, and system continues to
operate normally without needed to install excessive dependencies
* **Response measure:** Less than 30 minutes needed to transfer the system
between machines and be reader for deployment

---

### 4.5 Constraints [↑](https://github.com/abemelvin/tiamat)

#### Business

* System will only utilize open-source or free software without licensing
restrictions
* Team is limited to a $150 USD budget for development and testing on AWS
public cloud infrastructure

#### Technical

* System is limited to virtualization under a local hypervisor as the only
means of deploying the mock network
* Deploying on public cloud infrastructure presents risks in terms of both
security and legality
* Hardware resources are not available to avoid virtualization

---

### 4.6 Mock network [↑](https://github.com/abemelvin/tiamat)

#### Intranet

1. Web server

* Hosts a web application through which the contractor notionally files work 
orders. The web application requires the user to log in with a username and 
password, and connects to a database service. The database service is running
locally with system privileges and is vulnerable to an injection attack.

2. Authentication server

* Runs a lightweight directory access protocol (LDAP) service that
authenticates users and groups on the network. The LDAP service also
provides a central point for configuring user and group privileges.

3. Payment server

* Runs a database service locally that notionally stores redacted transaction
information from purchases made at retail locations. A script generates
messages with unredacted transaction information that are sent to the database.
Under normal operating conditions, the database receives the message and only
stores a redacted record of the transaction. When successfully exploited, the
database stores unredacted transaction records that include sensitive
payment information.

#### Extranet

1. Gateway

* Receives all IP packets entering or leaving the intranet. Applies a
pre-configured routing table to all received IP packets to determine which host
to deliver to. IPv4 forwarding is enabled.

2. Firewall

* Receives all IP packets entering or leaving the intranet. Applies a
stateless pre-configured firewall ruleset to all IP packets to provide
basic intranet network isolation.

3. Intrusion detection/prevention system

* Sniffs and captures all IP packets entering or leaving the intranet.
Forwards packet captures to the centralized logging stack for post-processing
by the researcher while also providing real time alerts for any malicious
activity detected.

#### Internet

1. Contractor

* Runs a mail transfer agent (MTA) locally that is able to send mail to and
receive mail from the notional black hat.

2. Black hat

* Provides the researcher a manual injection point.

3. File transfer server

* Runs a local file transfer protocol (FTP) service that the black hat is
able to utilize as a repository for exfiltrating sensitve data from the
intranet payment server.

---

### 4.7 Instrumentation and data [↑](https://github.com/abemelvin/tiamat)

#### Centralized Logging

* SQL logs
* System logs
* Packet captures

#### Active Monitoring

---

### 4.8 Dependencies [↑](https://github.com/abemelvin/tiamat)

---

## 5 Key views [↑](https://github.com/abemelvin/tiamat)

### 5.1 Mock network diagram [↑](https://github.com/abemelvin/tiamat)

![mock network](https://github.com/abemelvin/tiamat/blob/master/mock_network.png "mock network")