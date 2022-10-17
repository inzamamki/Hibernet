package com.tns.repository;
import com.tns.entities.Certificate;

public interface CertificateRepository
{

	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificateById(int id);
	public Certificate deleteCertificate(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
