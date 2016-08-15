package com.gmcpvrhp.remotefinalnew;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.Formatter;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.net.InetAddress;

import java.io.IOException;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {


    //
    GetExample example = new GetExample();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupwwswaportActionBar(toolbar);
        Button UpButtonObject = (Button) findViewById(R.id.UpButton);
        Button DownButtonObject = (Button) findViewById(R.id.DownButton);
        Button LeftButtonObject = (Button) findViewById(R.id.LeftButton);
        Button RightButtonObject = (Button) findViewById(R.id.RightButton);
        Button FireButtonObject = (Button) findViewById(R.id.BreakButton);
        Button gButtonObject = (Button) findViewById(R.id.FutureUseButtonA);
        Button jButtonObject = (Button) findViewById(R.id.FutureUseButtonB);
        Button kButtonObject = (Button) findViewById(R.id.FutureUseButtonC);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Windows Gaming Using Android Application. Developed by GmCpVrHp", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
/*

*/

        UpButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_up.php");

                                System.out.println("Up Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_up.php");
                                System.out.println("Up Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });

//Down
        DownButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_down.php");
                                System.out.println("Down Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_down.php");
                                System.out.println("Down Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });






//  Left

        LeftButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_left.php");
                                System.out.println("Left Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_left.php");
                                System.out.println("Left Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });




        //Right
        RightButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_right.php");
                                System.out.println("Right Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_right.php");
                                System.out.println("Right Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });






        //Break

        FireButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_fire.php");
                                System.out.println("Break Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_fire.php");
                                System.out.println("Break Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });





        //g

        gButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_g.php");
                                System.out.println("g Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_g.php");
                                System.out.println("g Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });




        //j
        jButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_j.php");
                                System.out.println("j Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_j.php");
                                System.out.println("j Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });



        //k
        kButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_k.php");
                                System.out.println("k Button Pressed");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


//return true;

                } else if (event.getAction() == MotionEvent.ACTION_UP) {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/release_k.php");
                                System.out.println("k Button Released");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;
                }
                return false;

            }

        });



    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void PressUpButton(View view) {


        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_up.php"));wwwg sdawdwask
        //startActivity(intent);

        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_up.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                }


                return null;
            }
        }.execute();


    }

    //
    public void PressDownButton(View view) {
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_down.php"));
        //startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_down.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();


    }

    //
    public void PressLeftButton(View view) {
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_left.php"));
        //startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_left.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();

    }

    //
    public void PressRightButton(View view) {
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_right.php"));
        // startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_right.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();


    }
//

    public void PressFireButton(View view) throws IOException {
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_fire.php"));
        //startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_fire.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();

    }

    public void PressGButton(View view) {
        //Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_g.php"));
        //startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_g.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();

    }

    public void PressJButton(View view) {
        // Intent intent = new Intent();
        //intent.setAction(Intent.ACTION_VIEW);
        //intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_j.php"));
        //startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_j.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();

    }

    public void PressKButton(View view) throws IOException {
        //Intent intent = new Intent();
        //   intent.setAction(Intent.ACTION_VIEW);
        // intent.addCategory(Intent.CATEGORY_BROWSABLE);
        //intent.setData(Uri.parse("http://192.168.43.74:81/remote/press_k.php"));
        // startActivity(intent);
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    example.run("http://192.168.43.74:81/remote/press_k.php");
                } catch (Exception e) {
                    e.getStackTrace();
                    // Toast.makeText(this, "Error Down!", Toast.LENGTH_SHORT).show();
                }

                return null;
            }
        }.execute();

    }



 /*UpButtonObject.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_BUTTON_RELEASE) {

                    //up=1;
                    // Do what you want
                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_up.php");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return true;

                } else {

                    new AsyncTask<Void, Void, String>() {
                        @Override
                        protected String doInBackground(Void... params) {
                            try {
                                example.run("http://192.168.43.74:81/remote/press_g.php");
                            } catch (Exception e) {
                                e.getStackTrace();
                                // Toast.makeText(this, "Error UP!", Toast.LENGTH_SHORT).show();
                            }

                            return null;
                        }
                    }.execute();


                    return false;
                }
            }
        });*/


    //

}