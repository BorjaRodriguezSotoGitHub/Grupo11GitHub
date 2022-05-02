package es.upm.dit.isst.movres.model;

import javax.persistence.*;

@Entity
public class Vmp {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Double latitude;
	private Double longitude;
	private Boolean locked;
	private Boolean inUse;
//	private String code;

    protected Vmp (){}

    public Vmp(Double latitude, Double longitude, Boolean locked, Boolean inUse) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.locked = locked;
        this.inUse = inUse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getInUse() {
        return inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    @Override
    public String toString() {
        return "Vmp [id=" + id + ", inUse=" + inUse + ", latitude=" + latitude + ", locked=" + locked + ", longitude="
                + longitude + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((inUse == null) ? 0 : inUse.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((locked == null) ? 0 : locked.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vmp other = (Vmp) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (inUse == null) {
            if (other.inUse != null)
                return false;
        } else if (!inUse.equals(other.inUse))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (locked == null) {
            if (other.locked != null)
                return false;
        } else if (!locked.equals(other.locked))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        return true;
    }

    
}
