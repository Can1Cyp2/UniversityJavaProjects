package lab7;

/**
 * Every Auto shop owner has a name and a unique
 * <code>long</code> identification number.
 */

public class ShopOwner {

    private static long ID = 1000;
    private final String ownerName;
    private final long ownerId;

    /**
     * Initialize this auto shop owner to have
     * the given name. A unique
     * identification number is assigned to this auto shop owner.
     *
     * @param ownerName the non-null owner name of this auto shop owner
     */
    public ShopOwner(String ownerName) {
        this.ownerName = ownerName;
        this.ownerId = ShopOwner.ID++;
    }

    /**
     * Returns the unique identification number assigned
     * to this auto shop owner.
     *
     * @return the unique identification number assigned to
     * this auto shop owner
     */
    public long getID() {
        return this.ownerId;
    }


    /**
     * Returns the name of this auto shop owner.
     *
     * @return the name of this auto shop owner
     */
    public String getName() {
        return this.ownerName;
    }


    /**
     * Returns a hash code for this auto shop owner.
     *
     * @return a hash code for this auto shop owner
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (ownerId ^ (ownerId >>> 32));
        return result;
    }

    /**
     * Compares two auto shop owners for equality. Returns true if obj is
     * a non-null auto shop owner reference having
     * an identification number equal
     * to the identification number of this auto shop owner,
     * and false otherwise.
     *
     * @return true if obj is
     * a non-null auto shop owner reference having an
     * identification number equal
     * to the identification number of this auto shop owner,
     * and false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ShopOwner other = (ShopOwner) obj;
        return ownerId == other.ownerId;
    }

    /**
     * Returns a string representation of this auto shop owner. The string
     * contains the owner name and owner id of this auto shop owner.
     *
     * @return a string representation of this auto shop owner
     */
    @Override
    public String toString() {
        return this.ownerName + "(" + this.ownerId + ")";
    }
}
