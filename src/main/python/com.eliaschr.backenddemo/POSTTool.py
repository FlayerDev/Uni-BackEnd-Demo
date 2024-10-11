import requests
import argparse

#   if response.status_code == 200:
#    print(response.text)
#   else:
#    print(f"Failed with status code: {response.status_code}")
#    print("Response content:", response.text)

while True:

 url = input("Url:")
 response = requests.get(url+"/greeting")

 if response.status_code == 200:
  print(f"Connected to {url}")
  print("Use show to get messages or send {message} to send a message !!!")

  while True:
   req = input(">>")
   cmd = req.split(' ')[0]
   if cmd == "show":
    print(requests.get(url+"/messages").text)
   elif cmd == "send":
    print(requests.post(url+"/send", req.replace("send ", "")).text)
   else:
    print("Use show to get messages or send {message} to send a message !!!")


 else:
  print("Connection failed")
