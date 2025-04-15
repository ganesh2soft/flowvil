package in.ayna.flowvil.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendortbl")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vendorId;
	private String vendorName;
	private String vendorContact;
	private String vendorPhone;
	private String website;
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorContact() {
		return vendorContact;
	}
	public void setVendorContact(String vendorContact) {
		this.vendorContact = vendorContact;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public int hashCode() {
		return Objects.hash(vendorContact, vendorId, vendorName, vendorPhone, website);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return Objects.equals(vendorContact, other.vendorContact) && Objects.equals(vendorId, other.vendorId)
				&& Objects.equals(vendorName, other.vendorName) && Objects.equals(vendorPhone, other.vendorPhone)
				&& Objects.equals(website, other.website);
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorContact=" + vendorContact
				+ ", vendorPhone=" + vendorPhone + ", website=" + website + "]";
	}
	public Vendor(Long vendorId, String vendorName, String vendorContact, String vendorPhone, String website) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorContact = vendorContact;
		this.vendorPhone = vendorPhone;
		this.website = website;
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
