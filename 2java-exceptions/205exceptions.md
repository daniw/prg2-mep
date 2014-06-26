### Sie können die Exception Hierarchie erklären

---

[Zurück](200exceptions.md)

#### Klassenhierarchie bei Exceptions
Es gibt verschiedene Arten von Exceptions.
 
* Exceptions aus der standard Bibliothek
* Benutzerdefinierte Exceptions
* Checked Exceptions (müssen behandelt werden) 
* Unchecked Exceptions (können behandelt oder weitergegeben werden)

Hier eine Übersicht der Klassenhierarchie

	        +---------+                            
	        |Throwable|                            
	        +---------+                            
	             ^        
		     	 |                         
	     +-------+----------+                      
	     |                  |                      
	+----+----+        +----+----+                 
	|  Error  |        |Exception|                 
	+---------+        +---------+                 
	                        ^       
							|               
	           +------------+-----------+          
	           |                        |          
	  +--------+---------+     +--------+-------+  
	  |MyCheckedException|     |RuntimeException|  
	  +------------------+     +----------------+  
	                                    ^          
	                                    |          
	                         +----------+---------+
	                         |MyUncheckedException|
	                         +--------------------+
	

---
Siehe OOP6 S.26
