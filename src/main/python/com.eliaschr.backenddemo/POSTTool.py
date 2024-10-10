import requests
import argparse

#   if response.status_code == 200:
#    print(response.text)
#   else:
#    print(f"Failed with status code: {response.status_code}")
#    print("Response content:", response.text)

while True:

 url = input("Url:")
 response = requests.get(url)

 if response.status_code == 200:
  print(f"Connected to {url}")

  while True:
   print(requests.post(url, input(">>")).text)


 else:
  print("Connection failed")


