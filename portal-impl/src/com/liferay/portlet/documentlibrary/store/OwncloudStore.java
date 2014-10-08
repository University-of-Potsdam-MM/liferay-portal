package com.liferay.portlet.documentlibrary.store;

import java.io.InputStream;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class OwncloudStore extends BaseStore {

	@Override
	public String[] getFileNames(long companyId, long repositoryId)
			throws SystemException {
		/*
		 * String password = PrincipalThreadLocal.getPassword(); // TODO: Tests
		 * this: String userName = PrincipalThreadLocal.getName();
		 * 
		 * Sardine sardine = SardineFactory.begin();
		 * sardine.setCredentials(userName, password);
		 * 
		 * ArrayList<String> ret = new ArrayList<String>();
		 * 
		 * try { for (DavResource dr : sardine
		 * .list("http://localhost/owncloud/remote.php/webdav/")) {
		 * ret.add(dr.getPath()); } } catch (IOException e) { throw new
		 * SystemException(e); }
		 * 
		 * return ret.toArray(new String[ret.size()]);
		 */return null;
	}

	@Override
	public void updateFile(long companyId, long repositoryId, String fileName,
			String newFileName) throws PortalException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDirectory(long companyId, long repositoryId, String dirName)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFile(long companyId, long repositoryId, String fileName,
			InputStream is) throws PortalException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkRoot(long companyId) throws SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDirectory(long companyId, long repositoryId,
			String dirName) throws PortalException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFile(long companyId, long repositoryId, String fileName)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFile(long companyId, long repositoryId, String fileName,
			String versionLabel) throws PortalException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public InputStream getFileAsStream(long companyId, long repositoryId,
			String fileName, String versionLabel) throws PortalException,
			SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getFileNames(long companyId, long repositoryId,
			String dirName) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getFileSize(long companyId, long repositoryId, String fileName)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasDirectory(long companyId, long repositoryId,
			String dirName) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasFile(long companyId, long repositoryId, String fileName,
			String versionLabel) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(String srcDir, String destDir) throws SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFile(long companyId, long repositoryId,
			long newRepositoryId, String fileName) throws PortalException,
			SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFile(long companyId, long repositoryId, String fileName,
			String versionLabel, InputStream is) throws PortalException,
			SystemException {
		// TODO Auto-generated method stub

	}

}
