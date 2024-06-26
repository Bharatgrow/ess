


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <style>
            .banner-background{
               clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 100%, 66% 72%, 34% 100%, 0 75%, 0 0);
            }
        </style>
        
    </head>
    <body>
        <!-- navbar -->
        
        <main class="d-flex align-items-center primary-background " style="height:70vh">
            <div class="container">
                <div class="row">
                    
                    <div class="col-md-4 offset-md-4">
                        
                        <div class="card">
                            <div class="card-header primary-background text-dark text-center">
                                <span class="fa fa-user-plus fa-3x"></span>
                                <br>
                                <p> Login Here</p>
                            </div>
                            
                                
                            
                                
                                
                                
                            
                            <div class="card-body">
                                
                                <form id="reg-form" action="homeController" method="post">
                                    <div class="form-group">select role
                                        <select name="role">
                                            
                                            
                                            <option value="employee">employee</option>
                                        </select>
                                    </div>
                                     <div class="form-group">
                                           <label for="exampleInputEmail1">Email address</label>
                                           <input name="email" required type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                            
                                        </div>
                                    <div class="form-group">
                                          <label for="exampleInputPassword1">Id</label>
                                          <input name="id" required type="text" class="form-control" id="exampleInputPassword1" value="<%= (new java.util.Random().nextInt(9000) + 1000) %>" >
                                                
                                          </div>
                                    <div class="form-group">
                                          <label for="exampleInputPassword1">Name</label>
                                          <input name="name" required type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
                                          </div>
                                        <div class="form-group">
                                          <label for="exampleInputPassword1">Password</label>
                                          <input name="password" required type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                          </div>
                                           <div class="form-group">
                                          <label for="exampleInputPassword1">Picture</label>
                                          <input name="image" required type="file" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                          </div>
                                    <div class="container text-center">
                                        <button id="submit-btn" type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                       </form>
                                
                                
                                
                            </div>
                            
                            
                        </div>
                    </div>
                </div>
                
            </div>
            
        </main>
             
                                          
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/newjavascript.js" type="text/javascript"></script>


                                          
        
        
        
    </body>
</html>
