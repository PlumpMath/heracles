heracles
========

Java Isolation ClassLoader.

This is a "simple" way of abusing Java's ClassLoader to make static variables separate among instances.

This can be used for instance to run multiple non-threadsafe (as long that the critical region violations happen in static memory "region") instances in different threads.

I'll see you all in Java Hell (:
