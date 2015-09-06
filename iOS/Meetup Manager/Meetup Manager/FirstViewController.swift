//
//  FirstViewController.swift
//  Meetup Manager
//
//  Created by Teri Radichel on 9/5/15.
//  Copyright (c) 2015 Teri Radichel. All rights reserved.
//

import UIKit

class FirstViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func TouchDown(sender: AnyObject) {
        //Do something here
        let alert = UIAlertController(title: "Dude.", message: "You pushed the button!", preferredStyle: .Alert)
        alert.addAction(UIAlertAction(title: "OK", style: .Cancel, handler: nil))
        self.presentViewController(alert, animated: true, completion: nil)
        
    }

}

