package com.tns.services;


import com.tns.entities.Certificate;

public interface CertificateService
{
	public Certificate addCertificate(Certificate certificate);  
	public Certificate updateCertificate(Certificate certificate);  
	public Certificate searchCertificateById(int id); 
	public Certificate deleteCertificateById(int id); 

}
