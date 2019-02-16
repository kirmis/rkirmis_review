package main.java;

public final class Item<Key> {
        private Key key; // SER316 Assignment #4 - made variable private and added getter and setter for it
        //constructor
        public Item(Key keyValue) { 
                key = keyValue;
        }
        // further components and methods
        
        /**
         * Method: getKey
         * Inputs: none
         * Returns: key - the Item's key
         * 
         * Description: Gets the key of the Item.
         */
        	public Key getKey()
        	{
        		return key;
        	}
        	
        	/**
         * Method: setKey
         * Inputs: key - the item's new key
         * Returns: none
         * 
         * Description: Sets the key of the Item.
         */
        	public void setKey(Key key)
        	{
        		this.key = key;
        	}
}