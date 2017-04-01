import random,requests
import string
import cherrypy
import time,datetime
import simplejson as json
import os, os.path



class Server(object):    
    @cherrypy.expose
    def index(self):
        HtmlFile = open('index.html', 'r')
        source_code = HtmlFile.read()
        return source_code 
        
    @cherrypy.expose
    def getDetails(self,jobId):
        HtmlFile = open('details.html', 'r')
        source_code = HtmlFile.read()
        return source_code 
  
    @cherrypy.expose
    def tagAttributes(self):

        HtmlFile = open('demo.html', 'r')
        source_code = HtmlFile.read()
        return source_code 


@cherrypy.expose
class RecomendationWebService(object):

    
    def GET(self):
        print("userId: ")
        data=[]
        data = [  ['Title A', 17.449,78.37786, 1],
     ['Title B', 17.9277,78.37784, 2],
     ['Title C', 17.4277,78.3778, 3],
     ['Title D', 17.44277,78.377, 4]
];
       # ['Title A', 3.180967,101.715546, 1],
        
        resp={"data":data}   
        return json.dumps(resp)

    def POST(self, length=8):
        
        return "HI11"

    def PUT(self, another_string):
        return "HI11"

    def DELETE(self):
        return "HI11"
 
   
        
if __name__ == '__main__':
    conf = {
        '/': {
            'tools.sessions.on': False,
            'tools.staticdir.root': os.path.abspath(os.getcwd())
        },
        '/recomend': {
            'request.dispatch': cherrypy.dispatch.MethodDispatcher(),
            'tools.response_headers.on': True,
            'tools.response_headers.headers': [('Content-Type', 'text/plain')],
        }
    }
    webapp = Server()
    webapp.recomend = RecomendationWebService()
    cherrypy.quickstart(webapp, '/', conf)