import requests

head = {
# 有些网站需要设置用户代理
  'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36'
}
resp = requests.get('http://www.qianlima.com/', headers=head)
print(resp)
"""
<Response [403]>

<Response [200]>
"""