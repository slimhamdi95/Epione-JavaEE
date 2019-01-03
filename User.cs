using Microsoft.AspNet.Identity;
using Microsoft.AspNet.Identity.EntityFramework;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Security.Claims;
using System.Text;
using System.Threading.Tasks;

namespace Epione.Domain.Entities
{
   public  class User:IdentityUser 
    {
        public async Task<ClaimsIdentity> GenerateUserIdentityAsync(UserManager<User> manager)
        {
            // Note the authenticationType must match the one defined in CookieAuthenticationOptions.AuthenticationType
            var userIdentity = await manager.CreateIdentityAsync(this, DefaultAuthenticationTypes.ApplicationCookie);
            // Add custom user claims here
            return userIdentity;
        }


        public string FirstName { get; set; }

       
        public string LastName { get; set; }
       
        public System.DateTime? Birthday { get; set; }
       
        public string Adress { get; set; }

        public string Sexe { get; set; }

        
        public string Img { get; set; }
      
        public string Ville { get; set; }
    }
}
