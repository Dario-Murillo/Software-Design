using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using SimpleMVC.Models;

namespace SimpleMVC.Controllers;
public class UsersController : Controller
{
    List<User> users = new List<User>
    {
        new User { Id = 1, Name = "John Doe", Email = "john@example.com", Age = 30 },
        new User { Id = 2, Name = "Jane Smith", Email = "jane@example.com", Age = 25 },
        new User { Id = 3, Name = "Alice Johnson", Email = "alice@example.com", Age = 35 }
    };

    // GET: UsersController
    public ActionResult Index()
    {
        return View();
    }

    // GET: UsersController/Details/5
    [Route("users/{id}")]
    public ActionResult Details(int id)
    {
        var user = users.Find(u => u.Id == id);
        if (user == null)
        {
            return NotFound();
        }
        return View(user);
    }

    // GET: UsersController/Create
    public ActionResult Create()
    {
        return View();
    }

    // POST: UsersController/Create
    [HttpPost]
    [ValidateAntiForgeryToken]
    public ActionResult Create(IFormCollection collection)
    {
        try
        {
            return RedirectToAction(nameof(Index));
        }
        catch
        {
            return View();
        }
    }

    // GET: UsersController/Edit/5
    public ActionResult Edit(int id)
    {
        return View();
    }

    // POST: UsersController/Edit/5
    [HttpPost]
    [ValidateAntiForgeryToken]
    public ActionResult Edit(int id, IFormCollection collection)
    {
        try
        {
            return RedirectToAction(nameof(Index));
        }
        catch
        {
            return View();
        }
    }

    // GET: UsersController/Delete/5
    public ActionResult Delete(int id)
    {
        return View();
    }

    // POST: UsersController/Delete/5
    [HttpPost]
    [ValidateAntiForgeryToken]
    public ActionResult Delete(int id, IFormCollection collection)
    {
        try
        {
            return RedirectToAction(nameof(Index));
        }
        catch
        {
            return View();
        }
    }
}
