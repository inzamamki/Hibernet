package com.tns.services;


import com.tns.entities.Certificate;
import com.tns.repository.CertificateRepositoryImpl;
import com.tns.repository.CertificateRepository;

public class CertificateServiceImpl implements CertificateService
{

	
	private CertificateRepository dao;
	public CertificateServiceImpl()
	{
		dao = new CertificateRepositoryImpl();
	}
	
	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
	      dao.addCertificate(certificate);
	      dao.commitTransaction();
			return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate)
	{
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificateById(int id)
	{
		Certificate certificate = dao.searchCertificateById(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificateById(int id)
	{
		Certificate certificate = dao.searchCertificateById(id);
		return certificate;
	}

}