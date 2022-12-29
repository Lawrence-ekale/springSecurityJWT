# springSecurityJWT

This demo requires one to generate both private and public keys because I have used assymmetric keys.

Some of the steps I used in generating the keys are:
i) Creating a package of type certs that we will put the files.
ii) Ran the following commands:
  a) openssl genrsa -out myKeyPair.pem 2048 
  (What this does is generating a RSA and outputting it ot the named file if it does not exist then it will create one)
  b) openssl -rsa -in myKeyPair.pem -pubout -out public.pem
  (Extracting the public key from the file and storing it in public.pem file)
  c) openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in myKeyPair.pem -out private.pem
  (Generating a private key and storing it in private.pem file)
